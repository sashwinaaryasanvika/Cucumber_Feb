package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenDress_Pages {
	
	public static WebDriver driver;
	@FindBy(xpath="//a[@title='Women']")
	private WebElement women;

	public WomenDress_Pages(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getWomen() {
		return women;
	}
	
	



}
