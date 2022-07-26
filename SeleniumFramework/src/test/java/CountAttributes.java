import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CountAttributes {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		List<WebElement> obj = driver.findElements(By.xpath("//input[@name=\"btnK\"]"));
		System.out.println(obj.size());
	}
	
}
