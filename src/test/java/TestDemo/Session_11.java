package TestDemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Session_11 {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		// Screenshot -- Full Page 
		
		TakesScreenshot ts=driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		String path="C:\\Users\\Dell\\eclipse-workspace\\AutomationTestProject_Batch22";
		File destn =new File(path+"\\FullPageTest.png");
		FileUtils.copyFile(src, destn);
		
		
		// Element -Screenshot 
		
		WebElement MTLogo=driver.findElement(By.xpath("//img[@alt='Mercury Tours']"));
		File src1=MTLogo.getScreenshotAs(OutputType.FILE);
		File destn1 =new File(path+"\\Logo.png");
		FileUtils.copyFile(src1, destn1);
		
		
	}

}
