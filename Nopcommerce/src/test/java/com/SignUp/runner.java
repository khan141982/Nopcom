package com.SignUp;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "C:\\Users\\Farrukh Khan\\eclipse-workspace\\Nopcommerce\\src\\test\\resources\\com\\signup\\features\\com.feature",

plugin= "html:target/cucumber.html-report",tags= {"@Test"},
dryRun = false)


public class runner {

	

}
