package TestDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Session_3 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		// We have to identify WebElement ---> Locators ---> Name 
		
		
		WebElement Email=driver.findElement(By.name("email"));
		Email.sendKeys("Test@gmail.com");
		
		WebElement Password=driver.findElement(By.name("pass"));
		Password.sendKeys("12345678");
		
		WebElement LoginBtn=driver.findElement(By.name("login"));
		LoginBtn.click();
		
		// result of an Operation -verify
		
		String actualTitle=driver.getTitle(); // current Webpage title 
		System.out.println(actualTitle);
		String ExpectedTitle="Log in to Facebook"; // LoginPage  
		
		if(ExpectedTitle.equals(actualTitle)) {
			
			System.out.println("Test Case Pass");
		}
		else {
			System.out.println("Test Case Fail");
		}
		
		driver.quit();
		
	}

}
