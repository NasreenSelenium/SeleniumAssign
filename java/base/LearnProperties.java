package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
//to call property file
public class LearnProperties {

	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		//setup file path
		FileInputStream fis = new FileInputStream(new File ("./src/main/resources/config.properties"));
		//Load the file to properties
		prop.load(fis);
		//get values from propertyfile
		String url = prop.getProperty("url");
		System.out.println(url);
		String uname = prop.getProperty("username");
		System.out.println(uname);
		String pass = prop.getProperty("password");
		System.out.println(pass);
		
	}

}
