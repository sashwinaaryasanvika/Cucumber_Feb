package com.runnerfile;


import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclass_cucumber.BaseClasss;
import com.helperfile.File_Read_Manager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\featurefile",
					glue ="com.stepdefinition",
					tags = {"@regression_run", "~@run"},
					monochrome = true,
					strict = true,
					dryRun = false,
					
					plugin = {"html:CucumberReports/login",
							   "pretty"	,
							   "json:CucumberReports/loginFeature.json",
							   "com.cucumber.listener.ExtentCucumberFormatter:CucumberReports/extentreport.html"
					}
								
		)
public class TestRunnerFile {	
	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() throws IOException {
		String browser = File_Read_Manager.getInstance().getInstanceCR().getBrowser();
		driver=BaseClasss.get_Drivers(browser);
	}
	@AfterClass
	public static void tearDown() {
		
		driver.close();
	}
	
		
	}
		


