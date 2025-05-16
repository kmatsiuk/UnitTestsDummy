package tests.junit;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestCalculator {

    @Test
    public void testAdd() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testSubtract() {
        assertEquals(2, 4 - 2);
    }

    @Test
    public void testMultiply() {
        assertEquals(8, 4 * 2);
    }

    @Test
    public void testDivide() {
        assertEquals(4, 8 / 2);
    }
}
