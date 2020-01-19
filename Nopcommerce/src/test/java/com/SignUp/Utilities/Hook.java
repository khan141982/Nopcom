package com.SignUp.Utilities;

import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {
	
	public static WebDriver driver;
	public static SoftAssertions sAssert;
	public static Boolean isDemoMode = true;
	
	@Before
	public void setDriver() {
		if(driver == null) {
			driver = CustomUtilities.startChromeBrowser();
			
		}
		if(sAssert == null)
			sAssert = new SoftAssertions();
	
			base.driver = driver;
			base.isDemoMode =  isDemoMode;
			base.sAssert = sAssert;
			
					
	}
	
	@After
	public void tearDown(Scenario scenario) {

		if (scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshot, "image/png");

		}
		//driver.close();
		//driver.quit();
		 sAssert.assertAll();
	}
	}
	

