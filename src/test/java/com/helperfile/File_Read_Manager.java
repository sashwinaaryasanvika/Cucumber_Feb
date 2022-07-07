package com.helperfile;

import java.io.IOException;

public class File_Read_Manager {
	
	
	private File_Read_Manager() {
		
	}
	
	
	public static File_Read_Manager getInstance() {
		File_Read_Manager helper=new File_Read_Manager();
		return helper;

	}
	
	
	public  Configuration_Reader getInstanceCR() throws IOException {
		Configuration_Reader reader=new Configuration_Reader();
		return reader;

	}

}
