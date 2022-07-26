package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGMultiBrowserDemo {
	
	WebDriver driver =  null;
	
	@Parameters("browserName")
	@BeforeTest
	public void setUp(String browserName) {
		System.out.println("browser name is : "+ browserName+ " "+ "Thread is : " + Thread.currentThread().getId());
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("ie"))
		{
		WebDriverManager.iedriver().setup();
		driver = new InternetExplorerDriver();
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		}
	}
	
	@Test
	public void test1() {
		driver.get("http://www.google.com");
		//driver.findElement(By.xpath(""))		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
		System.out.println("Test completed successfully");
	}

}
