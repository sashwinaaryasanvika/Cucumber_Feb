package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page_Object_Manager {
	
	public static WebDriver driver; // null
	
	private Home_Pages hp;
	
	private Login_Automation login;
	
	private WomenDress_Pages wm;
	
	public Page_Object_Manager(WebDriver driver2) {
		
		this.driver=driver2;
		
	}	

	public Home_Pages getInstanceHp() {
		
		 hp=new Home_Pages(driver);
		 return hp;

	}
	
	public Login_Automation getInstanceLogin() {
		
		 login=new Login_Automation(driver);
		 return login;

	}
	
	public WomenDress_Pages getInstanceWomn() {
		
		 wm=new WomenDress_Pages(driver);
		 return wm;

	}
	
	// object private --> method create --> classname objName=new classname --> 
	
	
	
	
}
