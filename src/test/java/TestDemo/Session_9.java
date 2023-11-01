package TestDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Session_9 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		WebElement FirstName=driver.findElement(By.xpath("//input[@name='firstName']"));
		
		
		verifyElement_sendkeys(FirstName,"Test","First Name");
		/*
		boolean value1=FirstName.isDisplayed();
		System.out.println(value1);
		boolean value=FirstName.isEnabled(); // true/false
		System.out.println(value);
		
		if(FirstName.isDisplayed() && FirstName.isEnabled()) { // T && T =T
			FirstName.sendKeys("Test");
		}else {
			System.out.println("First name field id Disabled");
		}
		*/
		
		// Drop Option -- Without using select class method 
		
		
		WebElement DrpCountry=driver.findElement(By.xpath("//select[@name='country']"));
		
		Select DrpHandler=new Select(DrpCountry);
		
		List<WebElement> list=DrpHandler.getOptions();
		
		System.out.println(list.size()); //count 
		
		for(int i=0;i<list.size();i++) {
			
			String Option=list.get(i).getText();
			System.out.println(Option);
			
			if(Option.equals("RUSSIA")) {
				
				list.get(i).click();
				break;
			}
		}
		

	}

	public static void verifyElement_sendkeys(WebElement element ,String Value ,String fieldname) {
		
		if(element.isDisplayed() && element.isEnabled()) {
			
			element.sendKeys(Value);
			
		}else {
			System.out.println(fieldname +"== is not dispalyed or Enabled ");
		}
		
	}
	
	
}
