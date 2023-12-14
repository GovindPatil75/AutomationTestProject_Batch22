package TestDemo_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_ngAssertTest {
	
	
	@Test
	public void t1() {
		
		SoftAssert soft=new SoftAssert();
		
		System.out.println("Browser Open");
		System.out.println("Email Id");
		System.out.println("Password");
		System.out.println("Login button click");
		
		// Step -1  Launch Chrome Browser 
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//
		String expected="Test1";
		String actual="Test1";
		
		soft.assertEquals(actual, expected); // Pass 
		
		
		String expected1="ABC";
		String Actual1="XYZ";
		
		soft.assertEquals(Actual1, expected1); // Fail
		
		WebElement EmailId=driver.findElement(By.xpath("//input[@name='email']"));
		
		boolean value=EmailId.isEnabled();
		
		soft.assertTrue(value, "Verify Email Id Field ");
		
		soft.assertAll(); // Ommit 
		
		
		
		
	}

}
