package TestDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Session_13A {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		// Element -Shift -Upper case 
		//Shift key Down --Data enter --Shift release 
		
		Actions act=new Actions(driver);
		
		WebElement Email=driver.findElement(By.xpath("//input[@name='email']"));
		act.keyDown(Email, Keys.SHIFT).sendKeys("bugspotter").keyUp(Keys.SHIFT).build().perform();

		// ctrl down --send a--ctrl Up
		
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		
		// ctrl +c --down ctrl -c -Up ctrl
		
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		// Element Navigate --click
		WebElement password =driver.findElement(By.xpath("//input[@name='pass']"));
		password.click();
		
		// ctrl +v --down ctrl -v -Up ctrl
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		
		
		
	}

}
