package junittest;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestJunit1 {
    @Test
    public void testAdd() {
        int num = 5;
        String temp = null;
        String str = "Junit is working fine";

        //check for equality
        assertEquals("Junit is working fine", str);

        //check for false condition
        assertFalse(num > 6);

        //chekc for not null value.
        assertNotNull(str);

        //check for true condition
        assertTrue(true);

        System.out.println("That's OK");

        //make the test failure if hava no report
        //fail();
    }
}
