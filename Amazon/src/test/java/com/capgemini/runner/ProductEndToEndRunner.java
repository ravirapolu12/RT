package com.capgemini.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = "D:\\Selenium\\Amazon\\src\\main\\java\\com\\capgemini\\feature\\product.feature", //the path of the feature files
		glue={"com.capgemini.stepdefinition"}, //the path of the step definition files
		monochrome = true, 
		dryRun=false,
		format = { "progress", "html:target/cucumber-reports/cucumber-pretty",
				"json:target/cucumber-reports/CucumberTestReport.json",
				"rerun:target/cucumber-reports/rerun.txt" }, 
		plugin = "json:target/cucumber-reports/CucumberTestReport.json"
		)

public class ProductEndToEndRunner extends AbstractTestNGCucumberTests {

}
