package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessChromeDemo {
	
	public static void main(String[] args) {
		test();
	}
	
	public static void test() {
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
        driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]\r\n")).sendKeys("carousel");		
		driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[3]/center[1]/input[1]")).sendKeys(Keys.RETURN);
		
		driver.close();
		driver.quit();
		System.out.println("Completed");
		
	}

}
