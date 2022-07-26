package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPage;

public class GoogleSearchPageTest {
	
	//private static WebDriver driver = null;  --->if creating new method instead  of writing in main()
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		GoogleSearchPage.textbox_search(driver).sendKeys("carousel");
		GoogleSearchPage.searchbox(driver).sendKeys(Keys.RETURN);
		
		driver.close();
	}
}
