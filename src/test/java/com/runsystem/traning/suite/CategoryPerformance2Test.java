package com.runsystem.traning.suite;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import com.runsystem.traning.categories.PerformanceTests;

@Category({ PerformanceTests.class })
public class CategoryPerformance2Test {
    @Test
    public void test_B1() {
        Assert.assertTrue(true);
    }
 
    @Test
    public void test_B2() {
        Assert.assertTrue(true);
    }
}
