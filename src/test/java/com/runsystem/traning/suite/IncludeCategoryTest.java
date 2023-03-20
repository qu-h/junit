package com.runsystem.traning.suite;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import com.runsystem.traning.categories.PerformanceTests;

@RunWith(Categories.class)
@Categories.IncludeCategory(PerformanceTests.class)
@Suite.SuiteClasses({ CategoryPerformanceTest.class, CategoryPerformance2Test.class })
public class IncludeCategoryTest {
    
}
