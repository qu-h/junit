package com.runsystem.traning.suite;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.runsystem.traning.categories.IntegrationTests;
import com.runsystem.traning.categories.PerformanceTests;
import com.runsystem.traning.categories.RegressionTests;

@Category({ PerformanceTests.class, RegressionTests.class })
public class CategoryPerformanceTest3 {
    @Test
    public void test_C1() {
        Assert.assertTrue(true);
    }
 
    @Category(IntegrationTests.class)
    @Test
    public void test_C2() {
        Assert.assertTrue(true);
    }
}
