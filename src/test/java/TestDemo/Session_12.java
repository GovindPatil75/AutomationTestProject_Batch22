package TestDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Session_12 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		// ELement --Mouse Hover 
		
		WebElement Testing=driver.findElement(By.xpath("//a[text()='Testing']"));
		
		Actions act=new Actions(driver);
		
		// Mouse Hover 
		//act.moveToElement(Testing).build().perform();
		
		// Mouse Hover +Click
		//act.moveToElement(Testing).click().build().perform();
		
		

	}

}
