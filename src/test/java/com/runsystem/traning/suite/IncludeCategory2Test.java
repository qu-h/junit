package com.runsystem.traning.suite;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import com.runsystem.traning.categories.PerformanceTests;
import com.runsystem.traning.categories.RegressionTests;

@RunWith(Categories.class)
@Categories.ExcludeCategory({ RegressionTests.class })
@Suite.SuiteClasses({ CategoryPerformanceTest.class, CategoryPerformance2Test.class })
public class IncludeCategory2Test {
    // the class remains empty, used only as a holder for the above annotations
}
