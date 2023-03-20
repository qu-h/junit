package com.runsystem.traning.retry;

import static org.junit.Assert.assertEquals;
import java.net.ConnectException;
import org.junit.Rule;
import org.junit.Test;
 
class ThirdPartyApi {
     
    private static int retryCall = 0;
 
    public static String getData() throws ConnectException {
        if (retryCall < 2) {
            retryCall++;
            throw new ConnectException("Cannot retrieve data. Please try again");
        }
        return "runsystem.net";
    }
     
    public static String alwaysFailed() throws ConnectException {
        if (true) {
            throw new ConnectException("Cannot retrieve data. Please try again");
        }
        return "runsystem.net";
    }
}
 
public class RetryRuleTest {
 
    @Rule
    public RetryRule retryRule = new RetryRule(3, 10);
 
    @Test
    public void getDataTest() throws ConnectException {
        assertEquals("runsystem.net", ThirdPartyApi.getData());
    }
     
    @Test
    public void alwaysFailedTest() throws ConnectException {
        assertEquals("runsystem.net", ThirdPartyApi.alwaysFailed());
    }
}