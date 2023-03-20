package com.runsystem.traning.listener;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
 
public class IgnoreTest {
 
    @Test
    @Ignore("This test case will be ignored")
    public void ignoreTest() {
        String expected = "runsystem.net";
        Assert.assertEquals(expected, "runsystem.net");
    }
}