package edu.berkeley.aep;

import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.rules.ExpectedException;
import org.junit.Rule;



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


    @Test
    public void addsevenpluseightequalsfifteen()
    {
        Calculator x=new Calculator(7.0,8.0);
        TestCase.assertEquals(15.0,x.add());

    }

    @Rule
    public ExpectedException thrown= ExpectedException.none();
    @Test
    public void dividebyzeroexception()
    {
        Calculator x=new Calculator(7.0,0.0);
        x.divide();
    }
    @Test
    public void twopowerzeroone()
    {
        Calculator x=new Calculator(2.0,0.0);
        TestCase.assertEquals(1.0,x.power());

    }
    
    @Test
    public void multiplythreewithzerogiveszero()
    {
        Calculator x=new Calculator(3.0,0.0);
        TestCase.assertEquals(0.0,x.multiply());

    }


}
