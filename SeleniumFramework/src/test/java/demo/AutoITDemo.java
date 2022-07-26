package demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoITDemo {
	
	public static void main(String[] args) throws Exception {
		test();
	}
	
	public static void test() throws  Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		
		driver.findElement(By.xpath("//a[@id='pickfiles']")).click();
		Runtime.getRuntime().exec("C:\\Users\\Brindha\\Downloads\\FileUploadScript.exe");
		
		Thread.sleep(3000);
		//driver.close();
		
	}
	

}
