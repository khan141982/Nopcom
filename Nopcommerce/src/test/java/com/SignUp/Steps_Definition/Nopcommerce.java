package com.SignUp.Steps_Definition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.SignUp.Customer_Pages.DropDownPom;
import com.SignUp.Utilities.CustomUtilities;
import com.SignUp.Utilities.base;
import com.SiguUp.Add_New.AddNewPom;
import com.Sigunp.Customer_Info.CustomerInfoPom;
import com.login.Pages.InputPom;
import com.login.Pages.LogInPom;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;





public class Nopcommerce extends base {
	

	InputPom IP = new InputPom();
	LogInPom LP = new LogInPom();
	DropDownPom DDP = new DropDownPom();
	AddNewPom ADP = new AddNewPom();
	CustomerInfoPom CIP = new CustomerInfoPom();
	
	
	
@Given("^user should navigate to url for nopcommerce$")
public void user_should_navigate_to_url_for_nopcommerce() throws Throwable {
   driver.get("https://admin-demo.nopcommerce.com/login");
   
}

@Then("^user should enter \"([^\"]*)\" in email address$")
public void user_should_enter_in_email_address(String EMAIL) throws Throwable {
     
    IP.email.sendKeys(EMAIL);
  //Assert.assertEquals(EMAIL, IP.email.getAttribute("1"));
   sAssert.assertThat(EMAIL).isEqualTo(IP.email);
   CustomUtilities.highlightElement(IP.email);
   
   
}

@Then("^user should enter \"([^\"]*)\" in Password field$")
public void user_should_enter_in_Password_field(String Password) throws Throwable {
    
	IP.Password.sendKeys(Password);
}

@Then("^user should click the log in button to go to homepage of website$")
public void user_should_click_the_log_in_button_to_go_to_homepage_of_website() throws Throwable {
    LP.loginbutton.click();
}

@Given("^user should click the customer drop down button on the left corner$")
public void user_should_click_the_customer_drop_down_button_on_the_left_corner() throws Throwable {
   DDP.customer.click();
}

@Then("^user should select the customers option from the drop down$")
public void user_should_select_the_customers_option_from_the_drop_down() throws Throwable {
    DDP.customers.click();
}

@Then("^user should click the add new button on the right top conrner of the page$")
public void user_should_click_the_add_new_button_on_the_right_top_conrner_of_the_page() throws Throwable {
   ADP.addnewcustomer.click();
}

@When("^user should should click the drop down button to enter the customer info$")
public void user_should_should_click_the_drop_down_button_to_enter_the_customer_info() throws Throwable {
   
}

@When("^user should enter \"([^\"]*)\" in email field$")
public void user_should_enter_in_email_field(String EMAIL) throws Throwable {
   CIP.email.sendKeys(EMAIL);
}

@Then("^user should enter \"([^\"]*)\" in password field$")
public void user_should_enter_in_password_field(String Password) throws Throwable {
    CIP.password.sendKeys(Password);
}

@Then("^user should enter \"([^\"]*)\" in first name field$")
public void user_should_enter_in_first_name_field(String Firstname) throws Throwable {
    CIP.Firstname.sendKeys(Firstname);
}

@Then("^user should enter \"([^\"]*)\" in last name field$")
public void user_should_enter_in_last_name_field(String Lastname) throws Throwable {
    CIP.lastname.sendKeys(Lastname);
}

@When("^user should select gender FROM THE gender radio button$")
public void user_should_select_gender_FROM_THE_gender_radio_button() throws Throwable {
    CIP.Gender.click();
}

@When("^user should enter \"([^\"]*)\" in date of birth field$")
public void user_should_enter_in_date_of_birth_field(String dob) throws Throwable {
    CIP.DOB.sendKeys(dob);
}

@When("^user should \"([^\"]*)\" in company field$")
public void user_should_in_company_field(String company) throws Throwable {
   CIP.company.sendKeys(company);
}

@Then("^user should the check the check box field for tax exempet field$")
public void user_should_the_check_the_check_box_field_for_tax_exempet_field() throws Throwable {
   CIP.taxexempt.click();
}

@Then("^user should check the first check box field from Newsletter field$")
public void user_should_check_the_first_check_box_field_from_Newsletter_field() throws Throwable {
   CIP.Newsletter.click();
}

@Then("^user should select the role from customer roles drop down$")
public void user_should_select_the_role_from_customer_roles_drop_down() throws Throwable {
    JavascriptExecutor jse = (JavascriptExecutor)driver;
    jse.executeScript("window.scrollBy(0,250)"); 		
	//CIP.Roles.click();

WebDriverWait wait = new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.elementToBeClickable(CIP.Roles)); 
//	Select RP = new Select(CIP.Roles);
//	RP.sel
			
			
			
			
	CIP.Roles.click();
	//CustomUtilities.fluentWait(CIP.Roles)
   // CIP.Guest.click();
}

@Then("^user should selct vendor from manager of vendor drop down$")
public void user_should_selct_vendor_from_manager_of_vendor_drop_down() throws Throwable {
    CIP.Vendor.click();
    Select GP= new Select(driver.findElement(By.id("VendorId")));
    GP.selectByValue("1");
}

@Given("^user should check the check box field for active$")
public void user_should_check_the_check_box_field_for_active() throws Throwable {
    CIP.active.click();
}

@Then("^user should enter \"([^\"]*)\" in the admin comment field$")
public void user_should_enter_in_the_admin_comment_field(String COMMENT) throws Throwable {
   CIP.comment.sendKeys(COMMENT);
}

@Then("^user should click the save and continue botton the top right field of the page$")
public void user_should_click_the_save_and_continue_botton_the_top_right_field_of_the_page() throws Throwable {
    CIP.save.click();
}

@Given("^user should enter \"([^\"]*)\" in the email field$")
public void user_should_enter_in_the_email_field(String arg1) throws Throwable {
    
}

@Then("^user should click the search button$")
public void user_should_click_the_search_button() throws Throwable {
    
}


	
	
	
	
	
	

}
