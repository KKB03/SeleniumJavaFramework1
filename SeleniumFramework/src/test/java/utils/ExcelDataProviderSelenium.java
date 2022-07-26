package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelDataProviderSelenium {
	
	/* public static void main(String[] args) {
		String excelPath ="C:\\Users\\Brindha\\eclipse-workspace\\SeleniumFramework\\excel\\data.xlsx";
		testData(excelPath, "Sheet1");
	} */
	
	WebDriver driver =null;
	
	@BeforeTest
	public void setupTest() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	
	@Test(dataProvider = "testData1")
	public void test1(String username,String password) {
		System.out.println(username+"  "+password);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@DataProvider(name = "testData1" )
	public  Object[][] getData() {
		String excelPath ="C:\\Users\\Brindha\\eclipse-workspace\\SeleniumFramework\\excel\\data.xlsx";		
		Object data[][] =testData(excelPath, "Sheet1");	
		return data;
	}
	
	
	
	public Object[][] testData(String excelPath,String sheetName)
	{
		ExcelUtilsCallFunc excel = new ExcelUtilsCallFunc(excelPath, sheetName);
		int rowcount = excel.getRowCount(); 
		int colcount = excel.getColCount();  
		
		Object data[][] = new Object[rowcount-1][colcount];  //1st row is header ,so rowcount-1
		
		
		System.out.println();
		 for(int i=1; i < rowcount ;i++) {    //i=1,because data starts in 1 row ,0th row is username ,pwd
			 for(int j=0; j < colcount ;j++) {  //j=0, value strats in 1st column itself
				String cellData = excel.getCellDataString(i, j);
				//System.out.print(cellData + " ");
				data[i-1][j] = cellData;
				
			 }
			 System.out.println();
		 }
		 return data;
	}
}
