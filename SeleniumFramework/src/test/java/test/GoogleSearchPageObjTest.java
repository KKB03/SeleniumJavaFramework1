package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPageObj;
public class GoogleSearchPageObjTest {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		googleSearchObjTest();
	}
	
	public static void googleSearchObjTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		GoogleSearchPageObj searchPageObj = new GoogleSearchPageObj(driver);
		
		driver.get("http:/www.google.com");
		
		searchPageObj.setTextInSearch("carousel");
		searchPageObj.clickSearch();
	}

}
