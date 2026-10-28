package studio.vaif.android

import android.content.Context
import android.content.SharedPreferences
import android.os.Build
import android.security.keystore.KeyGenParameterSpec
import android.security.keystore.KeyProperties
import studio.vaif.TokenStorage
import studio.vaif.crypto.TokenCipher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlinx.coroutines.withContext
import java.security.KeyStore
import javax.crypto.KeyGenerator
import javax.crypto.SecretKey

/**
 * Single-process encrypted storage for Android API 23+. Only ciphertext is committed to private preferences.
 * The non-exportable AES-256-GCM key belongs to Android Keystore; hardware backing depends on the device.
 * Exclude the preferences file from backup and device transfer. Corruption and invalidated keys throw;
 * callers must explicitly clear the affected entry and sign in again. There is no plaintext fallback.
 */
public class AndroidKeystoreTokenStorage private constructor(
    private val preferences: SharedPreferences,
    private val alias: String,
    private val keyProvider: (() -> SecretKey)?,
) : TokenStorage {
    /**
     * Opens encrypted storage in the application context.
     * @param context Android context; only its application context is retained.
     * @param name Private preferences filename and Keystore alias suffix, using 1–100 letters, digits, dots, underscores or hyphens.
     * @throws IllegalArgumentException If Android is older than API 23 or the name is invalid.
     */
    public constructor(context: Context, name: String = "vaif_tokens") : this(
        openPreferences(context, name), "${context.applicationContext.packageName}.vaif.$name", null,
    )

    // CI unit tests inject the platform boundary; production always uses Android Keystore.
    internal constructor(preferences: SharedPreferences, keyProvider: () -> SecretKey) : this(preferences, "", keyProvider)

    private companion object {
        val lock = Mutex()
        fun openPreferences(context: Context, name: String): SharedPreferences {
            require(Build.VERSION.SDK_INT >= 23) { "Android Keystore token storage requires Android API 23+" }
            require(Regex("[A-Za-z0-9_.-]{1,100}").matches(name)) { "Invalid token storage name" }
            return context.applicationContext.getSharedPreferences(name, Context.MODE_PRIVATE)
        }
    }

    private fun secretKey(): SecretKey {
        keyProvider?.let { return it() }
        val store = KeyStore.getInstance("AndroidKeyStore").apply { load(null) }
        (store.getKey(alias, null) as? SecretKey)?.let { return it }
        return KeyGenerator.getInstance(KeyProperties.KEY_ALGORITHM_AES, "AndroidKeyStore").apply {
            init(KeyGenParameterSpec.Builder(alias, KeyProperties.PURPOSE_ENCRYPT or KeyProperties.PURPOSE_DECRYPT)
                .setBlockModes(KeyProperties.BLOCK_MODE_GCM).setEncryptionPaddings(KeyProperties.ENCRYPTION_PADDING_NONE)
                .setKeySize(256).setRandomizedEncryptionRequired(true).build())
        }.generateKey()
    }

    /**
     * Reads and authenticates an encrypted credential on the I/O dispatcher.
     * @param key Opaque origin- and project-scoped storage key.
     * @return Decrypted text, or null when the entry is absent.
     * @throws IllegalStateException If the serialized entry is malformed.
     * @throws java.security.GeneralSecurityException If Keystore access or ciphertext authentication fails.
     */
    public override suspend fun read(key: String): String? = withContext(Dispatchers.IO) {
        lock.withLock {
            val encoded = preferences.getString(key, null) ?: return@withLock null
            TokenCipher.decrypt(key, encoded, secretKey())
        }
    }

    /**
     * Atomically commits encrypted text or durably removes an entry on the I/O dispatcher.
     * @param key Opaque origin- and project-scoped storage key.
     * @param value Text to encrypt, or null to delete without accessing Keystore.
     * @throws IllegalStateException If the preferences commit fails.
     * @throws java.security.GeneralSecurityException If encryption or Keystore access fails.
     */
    public override suspend fun write(key: String, value: String?): Unit = withContext(Dispatchers.IO) {
        lock.withLock {
            val editor = preferences.edit()
            if (value == null) editor.remove(key)
            else editor.putString(key, TokenCipher.encrypt(key, value, secretKey()))
            check(editor.commit()) { "Could not persist encrypted tokens" }
        }
    }
}
