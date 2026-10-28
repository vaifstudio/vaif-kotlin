package studio.vaif.crypto

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import okio.ByteString.Companion.decodeBase64
import okio.ByteString.Companion.toByteString
import javax.crypto.AEADBadTagException
import javax.crypto.KeyGenerator

class TokenCipherTest {
    private fun key() = KeyGenerator.getInstance("AES").apply { init(256) }.generateKey()

    @Test fun `encrypted tokens round trip without storing plaintext`() {
        val secret = key()
        val encrypted = TokenCipher.encrypt("session", "refresh-token 😀", secret)
        assertTrue(encrypted.startsWith("v1:"))
        assertEquals(12, encrypted.split(":")[1].decodeBase64()!!.size)
        assertFalse(encrypted.contains("refresh-token"))
        assertEquals("refresh-token 😀", TokenCipher.decrypt("session", encrypted, secret))
        assertEquals("", TokenCipher.decrypt("session", TokenCipher.encrypt("session", "", secret), secret))
    }

    @Test fun `each write uses a fresh nonce`() {
        val secret = key()
        val first = TokenCipher.encrypt("session", "token", secret)
        val second = TokenCipher.encrypt("session", "token", secret)
        assertNotEquals(first.split(":")[1], second.split(":")[1])
        assertNotEquals(first.split(":")[2], second.split(":")[2])
    }

    @Test fun `ciphertext cannot move to another storage key`() {
        val secret = key()
        val encrypted = TokenCipher.encrypt("origin-one", "token", secret)
        assertThrows(AEADBadTagException::class.java) { TokenCipher.decrypt("origin-two", encrypted, secret) }
    }

    @Test fun `corrupt ciphertext and replacement installation keys fail closed`() {
        val secret = key()
        val encrypted = TokenCipher.encrypt("session", "token", secret)
        assertThrows(AEADBadTagException::class.java) { TokenCipher.decrypt("session", encrypted, key()) }
        val parts = encrypted.split(":")
        val bytes = parts[2].decodeBase64()!!.toByteArray()
        bytes[0] = (bytes[0].toInt() xor 1).toByte()
        val tampered = "${parts[0]}:${parts[1]}:${bytes.toByteString().base64()}"
        assertThrows(AEADBadTagException::class.java) { TokenCipher.decrypt("session", tampered, secret) }
    }

    @Test fun `invalid versions encodings nonce lengths and truncated tags fail closed`() {
        val secret = key()
        val encrypted = TokenCipher.encrypt("session", "token", secret)
        val parts = encrypted.split(":")
        for (invalid in listOf("", encrypted.replaceFirst("v1:", "v2:"), "$encrypted:extra",
            "v1:!:${parts[2]}", "v1:${parts[1]}:!", "v1:AAAAAAAAAAA=:${parts[2]}", "v1:${parts[1]}:AA==")) {
            assertThrows(IllegalStateException::class.java) { TokenCipher.decrypt("session", invalid, secret) }
        }
    }
}
