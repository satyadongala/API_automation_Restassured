package com.cucumber.framework.runner;

import org.junit.runner.RunWith;

//import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/featurefiles/ClinicalAPI.feature" },

		glue = { "com.cucumber.framework.stepDef" }, 
		plugin = { "pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/" },
		tags = "@HRS",
		monochrome = true, 
		dryRun = false)

public class CommonRunner {
}