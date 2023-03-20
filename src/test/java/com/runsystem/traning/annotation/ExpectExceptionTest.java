package com.runsystem.traning.annotation;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import com.runsystem.traning.MathDemo;

public class ExpectExceptionTest {
    
    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() throws Exception {
        MathDemo.divide(1, 0);
    }

    @Test
    public void testDivideByZero2() throws Exception {
        try {
            MathDemo.divide(1, 0);
            Assert.fail("Not throw an exception");
        } catch (Exception e) {
            Assert.assertTrue(e instanceof IllegalArgumentException);
            Assert.assertEquals("Cannot divide by zero (0).", e.getMessage());
        }
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void shouldTestExceptionMessage() throws Exception {
        // Keep this ordering: expect -> call the method which throw an exception
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Cannot divide by zero (0).");
 
        MathDemo.divide(1, 0);
    }
 
}
