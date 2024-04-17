package com.app.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\user\\Downloads\\Feb_Cucumber (2)\\Feb_Cucumber\\src\\test\\java\\com\\app\\feature",
		glue = "stepdefinition",
		dryRun = false,
		tags = "@asMap",
		publish = true,
		monochrome = true)

public class Runner {

}
