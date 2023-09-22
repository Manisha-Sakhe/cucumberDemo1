package com.Runner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) 

@CucumberOptions(
		features = {"src\\main\\java\\resources\\features\\multipleScenario.feature"},
		glue = {"com.stepDefinition"},
		//tags = ("@Positive or @Negative"),
		//plugin= {"pretty","html:target/cucumber-reports/Cucumber.html"},
		//plugin= {"pretty","json:target/cucumber-reports/Cucumber.json"},
		//plugin= {"pretty","junit:target/cucumber-reports/Cucumber.xml"}
		  plugin= {"usage"}
		//dryRun = true  
 )
public class runner1 {

}
