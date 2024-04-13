package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features = "F:\\Priya_Java_Testing\\LiveProject\\src\\test\\java\\com\\app\\feature",
		glue = "com.stepdefinition",
		dryRun = false,
		tags = "@tag1",
		publish = true,
		monochrome = true)

public class Runner {
	
}
