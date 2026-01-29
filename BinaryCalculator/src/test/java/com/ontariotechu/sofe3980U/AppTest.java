package com.ontariotechu.sofe3980U;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    //tests if the result is the expected result from the test 
    @Test
    public void orTest(){
        Binary bin1 = new Binary ("0100");
        Binary bin2 = new Binary ("0010");
        Binary binres = Binary.or(bin1, bin2);
        System.out.println("OR result = " + binres.getValue());
        assertTrue(binres.getValue().equals("0110")); 

    }

    //tests if the result is the expected result from the test 
    @Test
    public void andTest(){
        Binary bin1 = new Binary ("0100");
        Binary bin2 = new Binary ("0010");
        Binary binres = Binary.and(bin1, bin2);
        System.out.println("AND result = " + binres.getValue());
        assertTrue(binres.getValue().equals("0000")); 
    }

    //tests if the result is the expected result from the test
    @Test
    public void multTest(){
        Binary bin1 = new Binary ("0100");
        Binary bin2 = new Binary ("0010");
        Binary binres = Binary.multiply(bin1, bin2);
        assertTrue(binres.getValue().equals("1000")); 
    }
}
