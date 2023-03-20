package com.runsystem.mockito.dothen;

import java.util.List;
import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

public class ArgumentMatcherTest {
    @Test
    public void anyIntTest() {
        List<String> mockedList = Mockito.mock(List.class);
 
        // Configure mock to return a specific value on a method call
        Mockito.when(mockedList.get(Mockito.anyInt())).thenReturn("gpcoder.com");
        Mockito.when(mockedList.add(Mockito.anyString())).thenReturn(true);
 
        // Verify behavior
        Assert.assertEquals(true, mockedList.add("gpcoder.com"));
        Assert.assertEquals(true, mockedList.add("mockito"));
        Assert.assertEquals("gpcoder.com", mockedList.get(0));
        Assert.assertEquals("gpcoder.com", mockedList.get(4));
    }
}