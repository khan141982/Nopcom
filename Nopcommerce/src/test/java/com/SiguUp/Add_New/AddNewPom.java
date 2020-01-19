package com.SiguUp.Add_New;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SignUp.Utilities.base;

public class AddNewPom extends base {
	
	public AddNewPom() {
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//div[@class='pull-right']/a[@class='btn bg-blue']")
	public WebElement addnewcustomer;
	

}
