package com.runsystem.traning.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import com.runsystem.traning.annotation.MathDemoTest;
 
@RunWith(Suite.class)
@Suite.SuiteClasses({ MathDemoTest.class, Suite1Test.class })
public class Suite2Test {
    
}
