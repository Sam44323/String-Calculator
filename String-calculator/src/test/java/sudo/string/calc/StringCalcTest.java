package sudo.string.calc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalcTest {
    @Test
    public void testEmptyString() {
        assertEquals(0, StringCalc.Add(""));
    }

    @Test
    public void testForSingleNumberValue() {
        assertEquals(100, StringCalc.Add("100"));
    }
}
