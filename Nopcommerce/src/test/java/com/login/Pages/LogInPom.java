package com.login.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SignUp.Utilities.base;

public class LogInPom extends base {
	public LogInPom() {
		PageFactory.initElements(driver,this);
		
			
	}
	
@FindBy(xpath= "//div[@class='buttons']/input[@class='button-1 login-button']")
             public WebElement loginbutton;
             

}
