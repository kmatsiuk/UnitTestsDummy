package tests.testng;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TestCalculator {

    @Test
    public void testAdd() {
        assertEquals(2 + 2, 4);
    }

    @Test
    public void testSubtract() {
        assertEquals(4 - 2, 2);
    }

    @Test
    public void testMultiply() {
        assertEquals(4 * 2, 8);
    }

    @Test
    public void testDivide() {
        assertEquals(8 / 2, 4);
    }
}
