package TestDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Session_15 {

	public static void main(String[] args) throws Exception {
		
//		String path="C:\\Users\\Dell\\eclipse-workspace\\AutomationTestProject_Batch22\\TestData\\DataTest.xlsx";
//		FileInputStream fis=new FileInputStream(path);
//		XSSFWorkbook wb=new XSSFWorkbook(fis);
//		
//		double data =wb.getSheet("LoginTest").getRow(0).getCell(3).getNumericCellValue();
//		
//		System.out.println(data);
//		
//		// 
//		String data1=String.valueOf(data).replace(".", "").replace("E8", "");
//
//		System.out.println(data1);
		
		String testdata=getNumericeDataExcel("LoginTest",0,3);
		System.out.println(testdata);
		
		
	}
	
	
	
	
	public static String getNumericeDataExcel(String SheetName,int row,int cell) throws Exception {
		String path="C:\\Users\\Dell\\eclipse-workspace\\AutomationTestProject_Batch22\\TestData\\DataTest.xlsx";
		FileInputStream fis=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		double data =wb.getSheet(SheetName).getRow(row).getCell(cell).getNumericCellValue();
		String data1=String.valueOf(data).replace(".", "").replace("E8", "");
		return data1;

	}

}
