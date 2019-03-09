package com.dou;
import org.junit.Test;
import static org.junit.Assert.*;
public class GeneratorTest {
    @Test
    public void testNoneNumber() {
        Generator g=new Generator();
        String pID="abcddfafsafas-&%";
        assertEquals(null,g.generateISBN(pID));

    }

    @Test
    public void testOverflowNUmber() {
        Generator g=new Generator();
        String pID="9781400079171";
        assertEquals(null,g.generateISBN(pID));
    }
    @Test
    public void testLessNumber(){
        Generator g=new Generator();
        String pID="97814000791";
        assertEquals(null,g.generateISBN(pID));
    }
    @Test
    public void testNormalNumber(){
        Generator g= new Generator();
        String pID="978140007917";
        assertEquals("1400079179",g.generateISBN(pID));
    }
}
