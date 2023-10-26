package TestDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Session_6A {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		// Identify WebElement -- text()
		//tagname[text()='text value']
		
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		
		
		

	}

}
