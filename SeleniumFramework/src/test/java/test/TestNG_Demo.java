package test;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPage;

public class TestNG_Demo {
	
	WebDriver driver = null;  //--->if creating new method instead  of writing in main()
	
	
	@BeforeTest
	public void setupTest() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@Test
	public  void googleSearch() {
		
		driver.get("https://www.google.com");
		
		GoogleSearchPage.textbox_search(driver).sendKeys("carousel");
		GoogleSearchPage.searchbox(driver).sendKeys(Keys.RETURN);
		
	}
	
	@AfterTest
	public void tearDown() {

		driver.close();
		driver.quit();
		System.out.println("Test Success");
	}
}
