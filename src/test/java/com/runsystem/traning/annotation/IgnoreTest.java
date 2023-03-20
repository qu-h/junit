package com.runsystem.traning.annotation;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

@Ignore("All test cases of this class will be ignored")
public class IgnoreTest {
    @BeforeClass
    
 
    @Test
    public void test_method1() {
        System.out.println("@Test - test_method_1");
    }

    @Test
    @Ignore("This test case will be ignored")
    public void testEquals() {
        String expected = "runsystem.net";
        Assert.assertEquals(expected, "runsystem.net");
    }

    @Test
    public void test_method2() {
        System.out.println("@Test - test_method_2");
    }
}
