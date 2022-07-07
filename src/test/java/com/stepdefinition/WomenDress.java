package com.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.baseclass_cucumber.BaseClasss;
import com.pomclass.Page_Object_Manager;
import com.runnerfile.TestRunnerFile;

import cucumber.api.java.en.Given;

public class WomenDress extends BaseClasss{
	public static WebDriver driver= TestRunnerFile.driver;
	
	public static Page_Object_Manager pom=new Page_Object_Manager(driver);
	
	@Given("^User is select the Women Dress$")
	public void user_is_select_the_Women_Dress() throws Throwable {
		 click_Button(pom.getInstanceWomn().getWomen());
			    
	}

}
