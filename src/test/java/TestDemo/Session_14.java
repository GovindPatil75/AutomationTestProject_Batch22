package TestDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Session_14 {

	public static void main(String[] args) throws IOException {
		
		String path="C:\\Users\\Dell\\eclipse-workspace\\AutomationTestProject_Batch22\\TestData\\DataTest.xlsx";
		
		FileInputStream fis=new FileInputStream(path);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		String data=wb.getSheet("LoginTest").getRow(0).getCell(0).getStringCellValue();
		
		String data1=wb.getSheet("LoginTest").getRow(0).getCell(1).getStringCellValue();
		
		System.out.println(data);
		
		System.out.println(data1);

	}

}
