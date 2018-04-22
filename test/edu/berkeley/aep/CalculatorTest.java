package edu.berkeley.aep;

import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.*;

public class CalculatorTest {


  
    @Test
    public void addfourplusequalseven()
    {
        Calculator x=new Calculator(4.0,3.0);
        TestCase.assertEquals(7.0,x.add());

    }


    @Test
    public void subfourminusthreeequalone()
    {
        Calculator x=new Calculator(4.0,3.0);
        TestCase.assertEquals(7.0,x.add());

    }



}
