package utils;
public class ExcelUtilsCallFuncDemo {
	public static void main(String[] args) {
		
		//
		//ExcelUtilsCallFunc excel = new ExcelUtilsCallFunc("C:\\Users\\Brindha\\eclipse-workspace\\SeleniumFramework\\excel\\data.xlsx", "Sheet1");
		
		//excel.getRowCount();
		//excel.getCellDataString(2, 1);
		//excel.getCellDataNumber(1,1);
		
		
		ExcelUtilsCallFunc.getRowCount();
		ExcelUtilsCallFunc.getCellDataString(2,1);
		ExcelUtilsCallFunc.getCellDataNumber(1,1);
	}

}
