package com.SignUp.Customer_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SignUp.Utilities.base;

public class DropDownPom extends base{
  public DropDownPom() {
	  
	  PageFactory.initElements(driver,this);
	    
  }
  
  @FindBy(xpath="//li[@class='treeview']//i[@class='fa fa-user']")
  
  public WebElement customer;
  
  @FindBy(xpath="//a[@class='menu-item-link']//span[.='Customers']")
  public WebElement customers;
  
}
