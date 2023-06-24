package com.helper;

import java.io.IOException;

import com.properties.Configuration_Reader;
import com.properties.Configuration_Reader;

public class File_Reader_manager {
	private File_Reader_manager() {

	}
	public static File_Reader_manager getInstance() {
		File_Reader_manager helper= new File_Reader_manager();
		return helper;
	}
	public Configuration_Reader getInstanceCR() throws IOException {
		Configuration_Reader reader=new Configuration_Reader();
		return reader;
	}

}
