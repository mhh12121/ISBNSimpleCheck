package com.dou;
import org.junit.Test;
import static org.junit.Assert.*;
public class GeneratorTest {
    @Test
    public void testNoneNumber() {
        Generator g=new Generator();
        String pID="abcddfafsafas";
        assertEquals(null,g.generateISBN(pID));

    }

    @Test
    public void testOverflowNUmber() {
        Generator g=new Generator();
        String pID="9781400079171";
        assertEquals(null,g.generateISBN(pID));
    }
}
