package com.tradingview.TestData;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



	@RunWith(Cucumber.class)
	@CucumberOptions(
	features = "/Users/zahed/eclipse-workspace/com.tradingview/src/test/java/com/tradingview/features/mostHLoftheday.feature", 
			glue={"stepDefinitions"} ,
			format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, 
			monochrome = true,
			//strict = true,
			dryRun = false			
			)

	public class TestRunner {
	 
	}
		
	//ORed : tags = {"@SmokeTest , @RegressionTest"} -- execute all tests tagged as @SmokeTest OR @RegressionTest
	//ANDed : tags = tags = {"@SmokeTest" , "@RegressionTest"} -- execute all tests tagged as @SmokeTest AND @RegressionTest