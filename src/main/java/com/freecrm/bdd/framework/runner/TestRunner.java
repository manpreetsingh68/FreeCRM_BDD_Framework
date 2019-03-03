package com.freecrm.bdd.framework.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "C:\\Users\\Manpreet\\workspace\\FreeCRMBDDFramework\\src\\main\\java\\com\\freecrm\\bdd\\framework\\feature\\FreeCRMLogin.feature", 
glue = {"com.freecrm.bdd.framework.stepDefinitions" },
format = {"pretty", "html:test-output"}
)

public class TestRunner {

}
