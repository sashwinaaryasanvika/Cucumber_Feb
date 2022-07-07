package com.helperfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import cucumber.deps.com.thoughtworks.xstream.converters.collections.PropertiesConverter;

public class Configuration_Reader {
	
	public static Properties p;
	public Configuration_Reader() throws IOException {
		
		File f=new File("C:\\Users\\Nandhini Varadhan\\eclipse-workspace\\Automation_Cucumber\\src\\test\\java\\com\\helperfile\\Configuration.properties");
		
		FileInputStream fis=new FileInputStream(f);
		
		p=new Properties();
		
		p.load(fis);
				
	}
	
	public String getBrowser() {
		
		String browse = p.getProperty("browser");
		return browse;

	}
	
	public String getUrl() {
		
		String url = p.getProperty("url");
		return url;

	}
	

	

}
