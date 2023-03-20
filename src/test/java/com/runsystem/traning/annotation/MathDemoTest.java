package com.runsystem.traning.annotation;

import com.runsystem.traning.MathDemo;
import org.junit.Assert;
import org.junit.Test;


public class MathDemoTest {
    @Test
    public void divide_SixDividedByTwo_ReturnThree() {
        final int expected = 3;
 
        final int actual = MathDemo.divide(6, 2);
 
        Assert.assertEquals(expected, actual);
    }
 
    @Test
    public void divide_OneDividedByTwo_ReturnZero() {
        final int expected = 0;
 
        final int actual = MathDemo.divide(1, 2);
        Assert.assertEquals(expected, actual);
    }
 
    @Test(expected = IllegalArgumentException.class)
    public void divide_OneDividedByZero_ThrowsIllegalArgumentException() {
        MathDemo.divide(1, 0);
    }
 
    @Test
    public void add_SixAddedByTwo_ReturnEight() {
        final int expected = 8;
 
        final int actual = MathDemo.add(6, 2);
 
        Assert.assertEquals(expected, actual);
    }
}
