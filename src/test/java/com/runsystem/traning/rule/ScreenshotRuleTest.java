package com.runsystem.traning.rule;

import java.io.IOException;
 
import org.junit.Rule;
import org.junit.Test;
import com.runsystem.traning.rule.custom.ScreenshotRule;
 
public class ScreenshotRuleTest {
 
    @Rule
    public ScreenshotRule screenshotRule = new ScreenshotRule();
 
    @Test
    public void testScreenShot() throws IOException {
        throw new IOException("Application is crashed");
    }
}