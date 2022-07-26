package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumWaitDemo {
	
	public static void main(String[] args) {
		seleniumWaits();
	}
	
	//@SuppressWarnings("deprecation")
	public static void seleniumWaits() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver  = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.google.com");
		
        driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]\r\n")).sendKeys("carousel");		
		driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[3]/center[1]/input[1]")).sendKeys(Keys.RETURN);
		
		
	//	WebDriverWait wait = new WebDriverWait(driver, 20);

		
	//	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.name("abcd")));
		
		driver.findElement(By.name("abc")).click();  //false condition
		
		driver.close();
		driver.quit();
	}

}
