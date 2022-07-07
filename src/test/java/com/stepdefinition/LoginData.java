package com.stepdefinition;

import org.openqa.selenium.WebDriver;


import com.baseclass_cucumber.BaseClasss;
import com.helperfile.File_Read_Manager;
import com.pomclass.Page_Object_Manager;
import com.runnerfile.TestRunnerFile;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginData extends BaseClasss{
	
	public static WebDriver driver= TestRunnerFile.driver;
	
	public static Page_Object_Manager pom=new Page_Object_Manager(driver);	
	
	
	@Before
	public void beforeHooks(Scenario s) {
		String name = s.getName();
		System.out.println("Name: " +name);

	}
	
	@After
	public void afterHooks(Scenario s) {
		String status = s.getStatus();
		System.out.println("Status: " +status);

	}
	
	
	
	
	@Given("^User launch in the application$")
	public void user_launch_in_the_application() throws Throwable {
		
		String url = File_Read_Manager.getInstance().getInstanceCR().getUrl();
		System.out.println(url);
		getUrl(url);
	    
	}
	
	@When("^User is click on sigin button$")
	public void user_is_click_on_sigin_button() throws Throwable {
	   click_Button(pom.getInstanceHp().getSignin());
	}
	
	@When("^user is enter the \"([^\"]*)\" in Username Field$")
	public void user_is_enter_the_in_Username_Field(String username) throws Throwable {
		 input_Text(pom.getInstanceLogin().getUsername(), username);
	}

	@And("^user is enter the \"([^\"]*)\" in password field$")
	public void user_is_enter_the_in_password_field(String password) throws Throwable {
		input_Text(pom.getInstanceLogin().getPasswd(), password);
	}



	@Then("^user click on the Login Button and Its navigate to the Hotel Page$")
	public void user_click_on_the_Login_Button_and_Its_navigate_to_the_Hotel_Page() throws Throwable {
	    	click_Button(pom.getInstanceLogin().getSubmit());
	    	System.out.println("Submit");
	
	}
	
	



}
