package test;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsDemoTestNG {
	
	ExtentHtmlReporter htmlReporter ;
	ExtentReports extent;
	
	@BeforeSuite
	public void setUp() {
		
			htmlReporter = new ExtentHtmlReporter("extent.html");	
	
			extent = new ExtentReports();
			extent.attachReporter(htmlReporter);
	}
	
	@Test
	public void test() throws IOException {
		
		     ExtentTest test = extent.createTest("Google Search Test","Test to validate GS functionality");
		     test.log(Status.INFO, "Starting Test Case");
		     test.pass("Navigation done");
		     test.pass("Entered text in Searchbox");
		     test.fail("Pressed enter key");
		     test.addScreenCaptureFromPath("screenshot.png");
	}
	
	@AfterSuite
	public void tearDown() {
		
		extent.flush();
		
	}

}
