package TestDemo_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verify_Login_Functionality {
	
	@Test
	public void TC_login_001_Verify_Login_Functionality() {
		
		// Step -1  Launch Chrome Browser 
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//Step -2 - Valid Email Id 
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Test@gmail.com");
		
		//Step -3 Valid Password
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Test123");
		
		// Step -4 Click on Login Button
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		// Step -5 Verify
		
		String ActualTitle=driver.getTitle();
		
		String ExpectedTitle="Log in to Facebook";
		
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		
		System.out.println("Test 001");
	}
	

}
