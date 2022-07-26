package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EReportsDemo {
	ExtentHtmlReporter htmlReporter ;
	ExtentReports extent;
	WebDriver driver;
	
	@BeforeSuite
	public void setUp() {
		
			htmlReporter = new ExtentHtmlReporter("extentTest.html");	
	
			extent = new ExtentReports();
			extent.attachReporter(htmlReporter);

	}
	
	@BeforeTest
	public void setupTest() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@Test
	public void test() throws IOException {
		
		     ExtentTest test = extent.createTest("Search Test","Test to validate GS functionality");
		     
		     driver.get("http:/www.google.com");
		     test.pass("Navigated to Google");
		     
		     test.log(Status.INFO, "Starting Test Case");
		     test.pass("Navigation done");
		     test.pass("Entered text in Searchbox");
		     test.fail("Pressed enter key");
		     test.addScreenCaptureFromPath("screenshot.png");
	}
	
	
	@Test
	public void test1() throws IOException {
		
		     ExtentTest test1 = extent.createTest("Google Search Test","Test to validate GS functionality");
		     test1.log(Status.INFO, "Starting Test Case");
		     test1.pass("Navigation done");
		     test1.pass("Entered text in Searchbox");
		     test1.pass("Pressed enter key");
		     test1.addScreenCaptureFromPath("screenshot.png");
	}
	
	@AfterTest
	public void teardown() {

		driver.close();
		driver.quit();
		System.out.println("Test Success");
	}
	
	@AfterSuite
	public void tearDown() {
		
		extent.flush();
		
	}

}
