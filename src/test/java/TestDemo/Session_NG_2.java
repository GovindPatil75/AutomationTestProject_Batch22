package TestDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Session_NG_2 {
	
	ChromeDriver driver;
	
	
	@BeforeMethod
	public void BM() {
		System.out.println("Browser Open");
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void VerifyTest1() {
		System.out.println("Test 1");
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Test@gmail.com");
		
	}
	
	@Test
	public void VerifyTest2() {
		System.out.println("Test 2");
	}
	
	@AfterMethod
	public void AM() {
		System.out.println("Browser Close");
		
		driver.close();
	}

}
