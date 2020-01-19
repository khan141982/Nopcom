package com.Sigunp.Customer_Info;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SignUp.Utilities.base;

public class CustomerInfoPom extends base {
    public CustomerInfoPom() {
    	PageFactory.initElements(driver,this);
}
 
    @FindBy(name="Email")
    public WebElement email;
    
    @FindBy(id="Password")
    public WebElement password;
    
    @FindBy(name="FirstName")
    public WebElement Firstname;
    
    @FindBy(id="LastName")
    public WebElement lastname;
    
    @FindBy(id="Gender_Male")
    public WebElement Gender;
    
    @FindBy(name="DateOfBirth")
    public WebElement DOB;
    
    @FindBy(id="Company")
    public WebElement company;
    
    @FindBy(name="IsTaxExempt")
    public WebElement taxexempt;
    
    @FindBy(xpath="//div[@class='checkbox']//input[@name='SelectedNewsletterSubscriptionStoreIds']")
    public WebElement Newsletter;
    
    @FindBy(xpath="//div[@class='k-widget k-multiselect k-header']//span[@class='k-icon k-delete']")
    public WebElement Roles;
    
    @FindBy(id="SelectedCustomerRoleIds_taglist")
    public WebElement Guest;
    
    @FindBy(id="VendorId")
    public WebElement Vendor;
    
    @FindBy(name="Active")
    public WebElement active;
    
    @FindBy(name="AdminComment")
    public WebElement comment;
    
    @FindBy(name="save-continue")
    public WebElement save;
    
    
    
}
