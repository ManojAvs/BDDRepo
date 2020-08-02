package com.test.cucumber_bdd.main;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "features" }, 
glue = { "com.stepDefinitions" },
tags = {"@RegressionTest, @smoke" })

public class TestRunner {

}
