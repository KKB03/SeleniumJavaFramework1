import org.openqa.selenium.WebDriver;

//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {
	public static void main(String[] args) {
		
		
		String projectpath = System.getProperty("user.dir");
		System.out.println(projectpath);
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Brindha\\eclipse-workspace\\SeleniumFramework\\Drivers\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Brindha\\eclipse-workspace\\SeleniumFramework\\Drivers\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("http://seleniumhq.com");
		driver.close();
	}

}
