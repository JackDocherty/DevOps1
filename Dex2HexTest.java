import main.java.Dec2Hex;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Dec2HexTest {

    private Dec2Hex dec2Hex;

    // Constructor for the Dec2HexTest class
    public Dec2HexTest() {}

    // Initialises any needed objects before each test
    @Before
    public void setUp() {
        dec2Hex = new Dec2Hex();
    }

    // Test case to verify the conversion of a positive integer to hexadecimal
    @Test
    public void testConvertPositiveInteger() {
        assertEquals("255 should convert to FF", "FF", Dec2Hex.convertToHex(255));
    }

    // Test case to verify the conversion of zero to hexadecimal
    @Test
    public void testConvertZero() {
        assertEquals("0 should convert to 0", "0", Dec2Hex.convertToHex(0));
    }

    // Test case to verify the conversion of a small positive integer
    @Test
    public void testConvertSmallNumber() {
        assertEquals("16 should convert to 10", "10", Dec2Hex.convertToHex(16));
    }

    // Test case to verify that a different number converts as expected
    @Test
    public void testConvertAnotherNumber() {
        assertEquals("31 should convert to 1F", "1F", Dec2Hex.convertToHex(31));
    }
}
