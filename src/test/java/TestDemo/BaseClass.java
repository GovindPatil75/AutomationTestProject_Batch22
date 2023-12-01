package TestDemo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	
     ChromeDriver driver;
	
	
	@BeforeMethod
	public void BM() {
		System.out.println("Browser Open");
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void AM() {
		System.out.println("Browser Close");
		
		driver.close();
	}
}
