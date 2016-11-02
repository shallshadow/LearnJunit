package hello;

import static org.junit.Assert.*;
import org.junit.Test;

public class HelloWorldTest{
    public HelloWorld hellWorld = new HelloWorld();

    @Test
    public void testHello(){
        hellWorld.sayHello();
        assertEquals("Hello World!",hellWorld.getStr());
    }
}
