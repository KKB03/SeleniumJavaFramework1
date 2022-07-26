package utils;


import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilsCallFunc {
	
	static String projectpath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	
	public ExcelUtilsCallFunc(String excelpath, String sheetName) {         //constructor
		
		try {
			String projectpath = System.getProperty("user.dir");
			workbook = new XSSFWorkbook(projectpath+"\\excel\\data.xlsx");
			sheet = workbook.getSheet("Sheet1");
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	
	public static void main(String[] args) {
		getRowCount();
		getCellDataString(0,0);
		getCellDataNumber(1,1);
	}
	
	public static  int getRowCount() 
	{		
		int rowcount = sheet.getPhysicalNumberOfRows();
		System.out.println("Number of Rows :"+rowcount);
		return rowcount;
		
	}
	public static  int getColCount() 	
	{		
		int colcount = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("Number of Columns :"+colcount);
		return colcount;

}
		public static  String getCellDataString(int rowNum,int colNum) {
			
			String celldata = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			//System.out.println("Cell Data if String: "+celldata);
			return celldata;
	
	}
       public static  void getCellDataNumber(int rowNum,int colNum) {
			
			Double celldata = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			System.out.println("Cell Data if Numeric : "+celldata);
	
	}
       

}
