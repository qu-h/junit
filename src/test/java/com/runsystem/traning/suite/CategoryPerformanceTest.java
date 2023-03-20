package com.runsystem.traning.suite;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import com.runsystem.traning.categories.PerformanceTests;
import com.runsystem.traning.categories.RegressionTests;

public class CategoryPerformanceTest {
    @Category(PerformanceTests.class)
    @Test
    public void test_A1() {
        Assert.assertTrue(true);
    }
 
    @Category({ PerformanceTests.class, RegressionTests.class })
    @Test
    public void test_A2() {
        Assert.assertTrue(true);
    }
 
    @Test
    public void test_A3() {
        Assert.assertTrue(true);
    }
}
