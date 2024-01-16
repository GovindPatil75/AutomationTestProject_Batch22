package TestDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Session_17 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		
		
		String ParentWId=driver.getWindowHandle(); // --Parent window Id 

		System.out.println(ParentWId);
		
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		Set<String> AllId=driver.getWindowHandles(); // Parent +Child Window Id
		
		System.out.println(AllId);
		
		
		List<String> list=new ArrayList<String>(AllId);
		
		String LIDP=list.get(0);
		String CWID=list.get(1);
		
		System.out.println(LIDP);
		
		driver.switchTo().window(CWID); // Switch Child Browser Window 
		
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("Test");
		
		//driver.close();  // current Browser Window Close
		
		driver.switchTo().window(ParentWId); // Switch to Parent Browser Window 
		
		driver.quit(); // current +All open window Close 
		
	}

}
