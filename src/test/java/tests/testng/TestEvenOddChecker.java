package tests.testng;

import org.testng.annotations.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import hw.EvenOddChecker;

public class TestEvenOddChecker {

    @Test
    public void testEvenNumber() {
        assertTrue(EvenOddChecker.check(4));
    }

    @Test
    public void testOddNumber() {
        assertFalse(EvenOddChecker.check(5));
    }
}
