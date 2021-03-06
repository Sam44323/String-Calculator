package sudo.string.calc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class StringCalcTest {
    @Test
    public void testEmptyString() {
        assertEquals(0, StringCalc.Add(""));
    }

    @Test
    public void testForSingleNumberValue() {
        assertEquals(100, StringCalc.Add("100"));
    }

    @Test
    public void testForTwoNumbersSum() {
        assertEquals(100, StringCalc.Add("60,40"));
    }

    @Test
    public void testMultipleNumbersSum() {
        assertEquals(23, StringCalc.Add("7,1,3,4,8"));
    }

    @Test
    public void testNewlineDelimiter() {
        assertEquals(90, StringCalc.Add("10,20,30\n15\n15"));
    }

    @Test
    public void testCustomDelimiter() {
        assertEquals(90, StringCalc.Add("//;\n10;20;30;15;15"));
    }

    @Test
    public void testNumberGtThousand() {
        assertEquals(23, StringCalc.Add("7,1,3,4,8,1001"));
    }

    @Test
    public void testLongDelimeters() {
        assertEquals(90, StringCalc.Add("//[!!!]\n10!!!20!!!30!!!15!!!15"));
    }

    @Test
    public void testForException() {
        try {
            StringCalc.Add("60,-1");
            fail("Exception expected");
        } catch (Exception e) {
            assertEquals("Negative integer not allowed", e.getMessage());
        }
    }

    @Test
    public void testMultipleDelimiters() {
        assertEquals(90, StringCalc.Add("//[***][!!!]\n10***20***30!!!15***15"));
    }
}
