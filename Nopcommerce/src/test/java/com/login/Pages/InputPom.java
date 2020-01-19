package com.login.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SignUp.Utilities.base;

public class InputPom extends base{
	public InputPom() {
		PageFactory.initElements(driver,this);
		
		
	}
	@FindBy(id="Email")
	public WebElement email;
	
	@FindBy(id="Password")
	public WebElement Password;
	
	

}
