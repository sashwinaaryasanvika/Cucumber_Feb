package com.pomclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Automation {
	
	
	public static WebDriver driver; //--- null 
	
	 @FindBy(id="email")
	 private WebElement username;
	 
	 
	 @FindBy(id="passwd")
	 private WebElement passwd;
	 
	 
	 @FindBy(xpath="//i[@class='icon-lock left']")
	 private WebElement submit;



	public Login_Automation(WebDriver driver2) {
		
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
		
	}



	public WebElement getUsername() {
		return username;
	}


	public WebElement getPasswd() {
		return passwd;
	}


	public WebElement getSubmit() {
		return submit;
	}
	 
	 
	 
	
	

}
