package studio.vaif.android

import android.content.SharedPreferences
import java.lang.reflect.Proxy
import java.security.KeyStoreException
import javax.crypto.KeyGenerator
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

/** Tests the adapter against the SDK's real interfaces; device Keystore behavior remains a device check. */
class AndroidKeystoreTokenStorageTest {
    private class Preferences {
        val values = mutableMapOf<String, String>()
        var commitSucceeds = true
        private val pending = mutableMapOf<String, String?>()
        private val editor: SharedPreferences.Editor by lazy {
            proxy(SharedPreferences.Editor::class.java) { name, args ->
                when (name) {
                    "putString" -> { pending[args[0] as String] = args[1] as String; editor }
                    "remove" -> { pending[args[0] as String] = null; editor }
                    "commit" -> {
                        if (commitSucceeds) pending.forEach { (key, value) ->
                            if (value == null) values.remove(key) else values[key] = value
                        }
                        pending.clear()
                        commitSucceeds
                    }
                    else -> error("Unexpected editor method $name")
                }
            }
        }
        val store: SharedPreferences = proxy(SharedPreferences::class.java) { name, args ->
            when (name) {
                "getString" -> values[args[0] as String]
                "edit" -> editor
                else -> error("Unexpected preferences method $name")
            }
        }
    }
    private companion object {
        // Android's API jar marks Class.cast as nullable; a proxy instance is never null.
        fun <T : Any> proxy(type: Class<T>, call: (String, Array<out Any?>) -> Any?): T = checkNotNull(type.cast(
            Proxy.newProxyInstance(type.classLoader, arrayOf(type)) { _, method, args -> call(method.name, args ?: emptyArray()) }
        ))
    }
    private fun key() = KeyGenerator.getInstance("AES").apply { init(256) }.generateKey()

    @Test fun `adapter stores ciphertext and survives instance replacement then durably deletes`() = runBlocking {
        val preferences = Preferences()
        val secret = key()
        val first = AndroidKeystoreTokenStorage(preferences.store) { secret }
        assertNull(first.read("session"))
        first.write("session", "refresh-token")
        assertFalse(preferences.values.getValue("session").contains("refresh-token"))
        val replacement = AndroidKeystoreTokenStorage(preferences.store) { secret }
        assertEquals("refresh-token", replacement.read("session"))
        replacement.write("session", null)
        assertTrue(preferences.values.isEmpty())
        assertNull(first.read("session"))
    }

    @Test fun `failed commits and unavailable keystore propagate without plaintext fallback`() = runBlocking {
        val preferences = Preferences()
        val secret = key()
        val store = AndroidKeystoreTokenStorage(preferences.store) { secret }
        preferences.commitSucceeds = false
        try { store.write("session", "token"); fail<Unit>() } catch (_: IllegalStateException) { }
        assertTrue(preferences.values.isEmpty())
        preferences.commitSucceeds = true
        store.write("session", "token")
        preferences.commitSucceeds = false
        try { store.write("session", null); fail<Unit>() } catch (_: IllegalStateException) { }
        assertTrue(preferences.values.containsKey("session"))
        val unavailable = AndroidKeystoreTokenStorage(preferences.store) { throw KeyStoreException("invalidated") }
        try { unavailable.read("session"); fail<Unit>() } catch (_: KeyStoreException) { }
        try { unavailable.write("other", "plaintext"); fail<Unit>() } catch (_: KeyStoreException) { }
        assertFalse(preferences.values.containsKey("other"))
        preferences.commitSucceeds = true
        unavailable.write("session", null) // A corrupt or invalidated key must not prevent deletion.
        assertTrue(preferences.values.isEmpty())
    }

    @Test fun `corruption and cross scope ciphertext fail closed in adapter`(): Unit = runBlocking {
        val preferences = Preferences()
        val secret = key()
        val store = AndroidKeystoreTokenStorage(preferences.store) { secret }
        store.write("origin-one", "token")
        preferences.values["origin-two"] = preferences.values.getValue("origin-one")
        try { store.read("origin-two"); fail<Unit>() } catch (_: javax.crypto.AEADBadTagException) { }
        preferences.values["origin-one"] = "plaintext"
        try { store.read("origin-one"); fail<Unit>() } catch (_: IllegalStateException) { }
    }
}
