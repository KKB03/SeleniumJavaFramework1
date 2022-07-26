package test;


//import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.PropertiesFile;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPage;

public class TestNG_Demo_propestiesfile {
	
	WebDriver driver;  
	public static String browserName = null;
	
	
	@BeforeTest
	public void setupTest() throws Exception {
		
		PropertiesFile.getProperties();

		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
				
		}
		else if(browserName.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
	}
	
	@Test
	public  void googleSearch() {
		
		driver.get("https://www.google.com");
		
		GoogleSearchPage.textbox_search(driver).sendKeys("carousel");
		GoogleSearchPage.searchbox(driver).sendKeys(Keys.RETURN);
		
	}
	
	@AfterTest
	public void tearDown() throws Exception {

		driver.close();
		driver.quit();
		System.out.println("Test Success");
		PropertiesFile.setProperties();
	}
}
