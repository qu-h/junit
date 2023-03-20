package com.runsystem.traning.annotation;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

public class LifeCycleDemoTest {
    @BeforeClass
    public static void runOnceBeforeClass() {
        System.out.println("@BeforeClass - runOnceBeforeClass");
    }
 
    @AfterClass
    public static void runOnceAfterClass() {
        System.out.println("@AfterClass - runOnceAfterClass");
    }
 
    @Before
    public void runBeforeTestMethod() {
        System.out.println("@Before - runBeforeTestMethod");
    }
 
    @After
    public void runAfterTestMethod() {
        System.out.println("@After - runAfterTestMethod");
    }
 
    @Test
    public void test_method_1() {
        System.out.println("@Test - test_method_1");
    }
 
    @Test
    public void test_method_2() {
        System.out.println("@Test - test_method_2");
    }

    @Test
    @Ignore("This test case will be ignored")
    public void testEquals() {
        String expected = "runsystem.net";
        Assert.assertEquals(expected, "runsystem.net");
    }
}
