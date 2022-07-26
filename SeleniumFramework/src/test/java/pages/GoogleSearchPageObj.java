package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObj {

    WebDriver driver = null; 
	
	By textbox_search = By.name("q");
	By search_button = By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[3]/center[1]/input[1]");
	
	public GoogleSearchPageObj(WebDriver driver) {  //constructor
		this.driver = driver;
	}
	
	public void setTextInSearch(String text) {
		
		driver.findElement(textbox_search).sendKeys(text);
	}
	
	public void clickSearch() {
		driver.findElement(search_button).sendKeys(Keys.RETURN);
	}
}
