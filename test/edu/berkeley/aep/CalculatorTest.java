package edu.berkeley.aep;

import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.*;

public class CalculatorTest {


    @Test
    public void add()
    {
        Calculator x=new Calculator(4.0,3.0);
        TestCase.assertEquals(1.0,x.subtract());

    }



}
