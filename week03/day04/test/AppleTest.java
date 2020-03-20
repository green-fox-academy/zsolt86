import org.junit.Test;

import static org.junit.Assert.*;

public class AppleTest {
    Apple myApple = new Apple();
    String expectedResult = "apple";
    String result = myApple.getApple();

    @Test
    public void testGetApple() {
        assertEquals(expectedResult, result);
    }
}