package utils;


import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	static String projectpath = System.getProperty("user.dir");
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public static void main(String[] args) {
		getRowCount();
		getCellDataString();
		getCellDataNumber();
	}
	
	public static  void getRowCount() {	
		
		try {
			
			workbook = new XSSFWorkbook(projectpath+"\\excel\\data.xlsx");
			sheet = workbook.getSheet("Sheet1");
			
			int rowcount = sheet.getPhysicalNumberOfRows();
			System.out.println("Number of Rows :"+rowcount);
		}
		
		catch (IOException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}
   public static  void getColCount() {	
		
		try {
			
			workbook = new XSSFWorkbook(projectpath+"\\excel\\data.xlsx");
			sheet = workbook.getSheet("Sheet1");
			
			int colcount = sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("Number of Rows :"+colcount);
		}
		
		catch (IOException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}
		public static  void getCellDataString() {
			
			try {
					
				workbook = new XSSFWorkbook(projectpath+"\\excel\\data.xlsx.xlsx");
				sheet = workbook.getSheet("Sheet1");
				
				String celldata = sheet.getRow(0).getCell(0).getStringCellValue();
				System.out.println("Cell Data if String: "+celldata);
			}
			
			catch (IOException e) {
				System.out.println(e.getMessage());
				System.out.println(e.getCause());
				e.printStackTrace();
			}
	
	}
       public static  void getCellDataNumber() {
			
			try {
					
				workbook = new XSSFWorkbook(projectpath+"\\excel\\data.xlsx.xlsx");
				sheet = workbook.getSheet("Sheet1");
				
				Double celldata = sheet.getRow(1).getCell(1).getNumericCellValue();
				System.out.println("Cell Data if Numeric : "+celldata);
			}
			
			catch (IOException e) {
				System.out.println(e.getMessage());
				System.out.println(e.getCause());
				e.printStackTrace();
			}
	
	}

}
