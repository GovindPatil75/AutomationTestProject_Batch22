package TestDemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class Test_10 {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		
		// Page Full Screenshot 
		/*
		String RM=RandomString.make(3); // abcd1 test4
		TakesScreenshot ts=driver; // casting -- Session Karan Sir 
		File src=ts.getScreenshotAs(OutputType.FILE);
		String path=System.getProperty("user.dir");
		File destn=new File(path+RM+".png");
		FileUtils.copyFile(src, destn);
*/
		
		captureFullPageScreenshot(driver);
	}
	
	
	public static void captureFullPageScreenshot(WebDriver driver) throws IOException {
		String RM=RandomString.make(3);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File Source=ts.getScreenshotAs(OutputType.FILE);
		File destn=new File(System.getProperty("user.dir")+"\\Screenshot"+RM+".png");
		FileUtils.copyFile(Source, destn);
	}

}
