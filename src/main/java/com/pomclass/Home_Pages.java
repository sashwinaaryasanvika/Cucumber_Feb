package com.pomclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Pages {
	
	public static WebDriver driver; //--------------null driver
	
	//WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
	
	@FindBy(xpath="//a[@class='login']")
	private WebElement signin;

	public Home_Pages(WebDriver driver2) {
		
		this.driver=driver2;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getSignin() {
		return signin;
	}
	
	

}
