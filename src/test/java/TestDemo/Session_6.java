package TestDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Session_6 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		// Identify WebElement ---> Relative --Xpath by Attribute 
		//tagname[@attributename='attribute value']
		
driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Test@gmail.com");
driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("123456789");
driver.findElement(By.xpath("//button[@name='login']")).click();
		
		
		
		
		
		

	}

}
