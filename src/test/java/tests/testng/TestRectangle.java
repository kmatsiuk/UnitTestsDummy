package tests.testng;

import hw.Rectangle;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class TestRectangle {

    Rectangle rect = new Rectangle(10.0, 5.0);

    @Test
    public void testLength() {
        assertEquals(10, rect.getLength(), 0.001);
    }

    @Test
    public void testWidth() {
        assertEquals(3.2, rect.getWidth(), 0.001);
    }

    @Test
    public void testSetLength() {
        rect.setLength(6.5);
        assertEquals(6.5, rect.getLength(), 0.001);
    }

    @Test
    public void testSetWidth() {
        rect.setWidth(3.2);
        assertEquals(3.2, rect.getWidth(), 0.001);
    }

    @Test
    public void testArea() {
        assertEquals(50.0, rect.getArea(), 0.001);
    }
}
