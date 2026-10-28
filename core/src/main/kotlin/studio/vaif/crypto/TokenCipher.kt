package studio.vaif.crypto

import okio.ByteString.Companion.decodeBase64
import okio.ByteString.Companion.toByteString
import javax.crypto.Cipher
import javax.crypto.SecretKey
import javax.crypto.spec.GCMParameterSpec

/** Authenticated credential serialization shared by JVM tests and Android Keystore storage. */
public object TokenCipher {
    /**
     * Encrypts a credential with a fresh provider-generated nonce and binds it to its storage key.
     * @param key Opaque storage key used as authenticated associated data.
     * @param value Credential text to encrypt as UTF-8.
     * @param secret AES key; Android callers supply a non-exportable Keystore key.
     * @return Versioned ciphertext in the format v1:base64(nonce):base64(ciphertext and tag).
     * @throws java.security.GeneralSecurityException If the provider cannot encrypt with this key.
     * @throws IllegalStateException If the provider does not generate a 12-byte GCM nonce.
     */
    public fun encrypt(key: String, value: String, secret: SecretKey): String {
        val cipher = Cipher.getInstance("AES/GCM/NoPadding")
        cipher.init(Cipher.ENCRYPT_MODE, secret)
        check(cipher.iv.size == 12) { "Invalid token IV" }
        cipher.updateAAD(key.toByteArray(Charsets.UTF_8))
        val bytes = cipher.doFinal(value.toByteArray(Charsets.UTF_8))
        return "v1:${cipher.iv.toByteString().base64()}:${bytes.toByteString().base64()}"
    }

    /**
     * Validates the serialization and authenticates a credential before returning plaintext.
     * @param key Original storage key used as authenticated associated data.
     * @param encoded Versioned ciphertext returned by [encrypt].
     * @param secret The same AES key used for encryption.
     * @return Authenticated UTF-8 credential text.
     * @throws IllegalStateException If the version, base64 fields, nonce or ciphertext size is invalid.
     * @throws java.security.GeneralSecurityException If the key is invalid or authentication fails.
     */
    public fun decrypt(key: String, encoded: String, secret: SecretKey): String {
        val parts = encoded.split(":")
        check(parts.size == 3 && parts[0] == "v1") { "Invalid encrypted token entry" }
        val iv = checkNotNull(parts[1].decodeBase64()) { "Invalid token IV encoding" }.toByteArray()
        val bytes = checkNotNull(parts[2].decodeBase64()) { "Invalid token ciphertext encoding" }.toByteArray()
        check(iv.size == 12) { "Invalid token IV" }
        check(bytes.size >= 16) { "Invalid token ciphertext" }
        val cipher = Cipher.getInstance("AES/GCM/NoPadding")
        cipher.init(Cipher.DECRYPT_MODE, secret, GCMParameterSpec(128, iv))
        cipher.updateAAD(key.toByteArray(Charsets.UTF_8))
        return String(cipher.doFinal(bytes), Charsets.UTF_8)
    }
}
