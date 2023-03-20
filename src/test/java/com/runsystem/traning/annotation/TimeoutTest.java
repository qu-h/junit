package com.runsystem.traning.annotation;

import com.runsystem.traning.TimeoutDemo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;


public class TimeoutTest {

    @Test(timeout = 3000) // 3 seconds
    public void testTimeout1() {
        int expected = 1;
        int actual = TimeoutDemo.doNormalTask();
        Assert.assertEquals(expected, actual);
    }
 
    @Test(timeout = 3000) // 3 seconds
    public void testTimeout2() {
        int expected = 1;
        int actual = TimeoutDemo.doHeavyTask();
        Assert.assertEquals(expected, actual);
    } 

    // Set timeout max 3 seconds per each method tested
    @Rule
    public Timeout globalTimeout = Timeout.seconds(3); // 3 seconds

    @Test
    public void testTimeout3() {
        int expected = 1;
        int actual = TimeoutDemo.doNormalTask();
        Assert.assertEquals(expected, actual);
    }
}
