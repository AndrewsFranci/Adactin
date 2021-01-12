package com.fb.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\Features\\logins.feature",glue= {"StepDefinition"})
public class TestRunner {

}
