package utils;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {
	
	/* public static void main(String[] args) {
		String excelPath ="C:\\Users\\Brindha\\eclipse-workspace\\SeleniumFramework\\excel\\data.xlsx";
		testData(excelPath, "Sheet1");
	} */
	
	@Test(dataProvider = "testData1")
	public void test1(String username,String password) {
		System.out.println(username+"  "+password);
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
