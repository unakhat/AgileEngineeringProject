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
  
    @Test
    public void multiplythreeandtwosix()
    {
        Calculator x=new Calculator(3.0,2.0);
        TestCase.assertEquals(6.0,x.multiply());

    }
  
    @Test
    public void dividethreebytwoequalonepointfive()
    {
        Calculator x=new Calculator(3.0,2.0);
        TestCase.assertEquals(1.5,x.divide());

    }
    @Test
    public void twopowerthreeeight()
    {
        Calculator x=new Calculator(2.0,3.0);
        TestCase.assertEquals(8.0,x.power());

    }
   @Test
    public void fourmodules3equalsone()
    {
        Calculator x=new Calculator(4.0,3.0);
        TestCase.assertEquals(1.0,x.modulus());

    }



}
