package com.runner;

import io.cucumber.core.snippets.SnippetType;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src\\test\\resources\\features", glue = "com.steps",monochrome = true,dryRun = true)
public class TestRunner extends AbstractTestNGCucumberTests {

}
