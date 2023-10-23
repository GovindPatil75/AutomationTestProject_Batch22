package TestDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Session_4 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		// Identify --- Locator -ID 
		WebElement Email=driver.findElement(By.id("email"));
		Email.sendKeys("Test@gmail.com");
		
		WebElement Password=driver.findElement(By.id("pass"));
		Password.sendKeys("12345678");
		
		WebElement LoginBtn=driver.findElement(By.name("login"));
		LoginBtn.click();

	}

}
