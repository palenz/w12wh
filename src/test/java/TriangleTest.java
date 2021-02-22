import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleTest {

    Triangle triangle;

    @Before
    public void before(){
        triangle = new Triangle(10, 10, 16);
    }

    @Test
    public void canPlay(){
        assertEquals("tinnnn", triangle.play());
    }

    @Test
    public void hasSize(){
        assertEquals(16, triangle.getSize());
    }

    @Test
    public void canSetPrice(){
        triangle.setPrice(12);
        assertEquals(12, triangle.getPrice());
    }

    @Test
    public void canCalculateMarkup(){
        triangle.setPrice(12);
        assertEquals(2, triangle.calculateMarkup());
    }
}
