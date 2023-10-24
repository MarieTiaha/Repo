
import static org.junit.Assert.*;
import org.junit.Test;

public class CryptoManagerTestStudent {

    @Test
    public void testIsStringInBounds() {
        assertTrue(CryptoManager.isStringInBounds("Hello World")); // All characters within bounds
        assertFalse(CryptoManager.isStringInBounds("Hello🌟")); // Contains a character outside bounds
    }

    @Test
    public void testCaesarEncryption() {
        assertEquals("Mjqqt", CryptoManager.caesarEncryption("Hello", 5));
        assertEquals("Ebiil Tloia", CryptoManager.caesarEncryption("Hello World", 4));
    }

    @Test
    public void testBellasoEncryption() {
        assertEquals("Wmpnh", CryptoManager.bellasoEncryption("Hello", "Key"));
        assertEquals("Wmpnh Wtyrf", CryptoManager.bellasoEncryption("Hello World", "Key"));
    }

    @Test
    public void testCaesarDecryption() {
        assertEquals("Hello", CryptoManager.caesarDecryption("Mjqqt", 5));
        assertEquals("Hello World", CryptoManager.caesarDecryption("Ebiil Tloia", 3));
    }

    @Test
    public void testBellasoDecryption() {
        assertEquals("Hello", CryptoManager.bellasoDecryption("Wmpnh", "Key"));
        assertEquals("Hello World", CryptoManager.bellasoDecryption("Wmpnh Wtyrf", "Key"));
    }
}