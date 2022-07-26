package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
//import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import test.TestNG_Demo_propestiesfile;

public class PropertiesFile {
	
	static Properties prop = new Properties();
	
	public static void main(String[] args) throws Exception {
		getProperties();
		setProperties();
		getProperties();
	}
	
	public static void getProperties() throws Exception {
		
		try {
			
			InputStream input = new FileInputStream("C:\\Users\\Brindha\\eclipse-workspace\\SeleniumFramework\\src\\test\\java\\config\\config.properties");
			prop.load(input);
			String browser = prop.getProperty("browser");
			System.out.println();
			TestNG_Demo_propestiesfile.browserName=browser;
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}
	
	public static void setProperties() throws Exception {
		try {
			OutputStream output = new FileOutputStream("C:\\Users\\Brindha\\eclipse-workspace\\SeleniumFramework\\src\\test\\java\\config\\config.properties");
			prop.setProperty("result","pass");
			prop.store(output, null);
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}
}
