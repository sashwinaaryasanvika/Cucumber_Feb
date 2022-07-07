package com.baseclass_cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClasss {
	
	public static WebDriver driver; //null driver
	
	public static WebDriver get_Drivers(String drivername) {
		
		if(drivername.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		 }
		
		
		else if(drivername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir") + "\\Driver\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			
			
		}
		
		return driver;
		}
	
		
	public static void click_Button(WebElement element) {
		element.click();

	}
	
	public static void input_Text(WebElement element, String input) {
		element.sendKeys(input);

	}
	
	public static void close() {
		driver.close();

	}
	
	public static void getUrl(String url) {
		driver.get(url);
		
	}
	
	public static void dropdown(WebElement element, String typ, String input) {
		
		Select s=new Select(element);
		
		//by value
		
		if(typ.equalsIgnoreCase("byvalue")) {
			
			s.selectByValue(input);
		}
				
		
		//byvissible text
		
		else if(typ.equalsIgnoreCase("byvissibleText")) {
			s.selectByVisibleText(input);
			
		}
		
		//byIndex
		
		else if(typ.equalsIgnoreCase("byIndex")) {
			int in = Integer.parseInt(input);  //String to Integer
			s.selectByIndex(in);
			
		}
		
		
		
		
		

	}


}
