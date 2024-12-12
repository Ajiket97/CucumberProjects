package com.aas.cucumberoptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	    features = "src/test/resources/features",
	    glue = {"com.aas.stepdefinations"},
	    plugin = {"pretty", "html:target/cucumber-reports.html"}
	)

public class TestRunner extends AbstractTestNGCucumberTests {
	@Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }

}
