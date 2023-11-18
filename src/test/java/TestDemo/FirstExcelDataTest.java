package TestDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstExcelDataTest {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		// Identify Element 
		
		String email=getStringExcelTestData("LoginTest",0,0);
		String password=getStringExcelTestData("LoginTest",0,1);
		
		String TestData=Session_15.getNumericeDataExcel("LoginTest", 0, 3);
		
		String demo=getStringExcelTestData("LoginTest",0,2); // java.lang.IllegalStateException
		System.out.println(demo);
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(TestData);
		
		

	}

	public static String getStringExcelTestData(String sheetname,int row,int cell) throws Exception {
		
		String path="C:\\Users\\Dell\\eclipse-workspace\\AutomationTestProject_Batch22\\TestData\\DataTest.xlsx";
		FileInputStream fis=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		return wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		
	}
	
	
	
}
