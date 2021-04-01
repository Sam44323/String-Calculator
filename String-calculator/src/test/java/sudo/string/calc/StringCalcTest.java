package sudo.string.calc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalcTest {
    @Test
    public void testAdd() {
        assertEquals(0, StringCalc.addition(""));
    }
}
