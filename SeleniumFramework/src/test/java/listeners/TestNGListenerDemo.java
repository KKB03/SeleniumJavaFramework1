package listeners;

//import org.junit.Assert;
import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
//import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//@Listeners(listeners.TestNGListeners.class)

public class TestNGListenerDemo {
	
	@Test
	public void test1() {
		System.out.println("I am inside Test 1");
	}
	
	@Test
	public void test2() {
		System.out.println("I am inside Test 2");
		//Assert.assertTrue(false);
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		
        driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]\r\n")).sendKeys("sound of magic");
        driver.findElement(By.name("abs")).sendKeys("carousel");
		//driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[3]/center[1]/input[1]")).sendKeys(Keys.RETURN);
		
        driver.close();
	}
	
	@Test
    public void test3() {
    	System.out.println("I am inside Test 3");
    	throw new SkipException("Test is skipped");
    }
    
}
