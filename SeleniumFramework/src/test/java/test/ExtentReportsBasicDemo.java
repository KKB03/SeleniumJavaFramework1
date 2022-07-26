package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportsBasicDemo {
	private static WebDriver driver = null;

	public static void main(String[] args) {
		
		//starting reporters
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
		
		//create ExtentReports and attach Reporters	
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		//creates toggle for test,adds all log events under it
		ExtentTest test = extent.createTest("Google Search Test","Test to validate GS functionality");
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		//log,pass and info 
		test.log(Status.INFO, "Starting Test Case");
		
		driver.get("https://www.google.com");
		
		test.pass("Navigation done");
		
		driver.findElement(By.name("q")).sendKeys("carousel");
		
		test.pass("Entered text in Searchbox");
		
		driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[3]/center[1]/input[1]")).sendKeys(Keys.RETURN);
		
		test.pass("Pressed enter key");
		
		//close and quit test
		driver.close();	
    	test.pass("Browser closed");
		driver.quit();
		test.info("Test completed");
	
		
		//to check "fail"
		

		//creates toggle for test,adds all log events under it
		ExtentTest test1 = extent.createTest("Google Search Test","Test to validate GS functionality");
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		
		test1.log(Status.INFO, "Starting Test Case");
		
		driver.get("https://www.google.com");
		
		test1.pass("Navigation done");
		
		driver.findElement(By.name("q")).sendKeys("carousel");
		
		test1.pass("Entered text in Searchbox");
		
		driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[3]/center[1]/input[1]")).sendKeys(Keys.RETURN);
		
		test1.fail("Pressed enter key"); //fail condition
		
		driver.close();	
    	test1.pass("Browser closed");
		driver.quit();
		test1.info("Test completed");
		
		//to write everything in file ,important, program will compile but report contains nothing
		extent.flush();
			
		}

}
