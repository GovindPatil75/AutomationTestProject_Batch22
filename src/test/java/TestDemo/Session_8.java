package TestDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Session_8 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		// Handle DropDown
		
		WebElement Drp_country=driver.findElement(By.xpath("//select[@name='country']"));
		/*
		Select sel=new Select(Drp_country);
		
		//selectByIndex()
		sel.selectByIndex(10);
		
		//selectByValue
		sel.selectByValue("BAHAMAS");
		
		//selectByVisibleText
		sel.selectByVisibleText("INDIA");
		*/
		handleDropDown_selectByVisibleText(Drp_country,"INDIA");
		
		handleDropDown_selectByIndex(Drp_country,13);
		
		handleDropDown_selectByValue(Drp_country,"BAHAMAS");
			
	}

	public static void handleDropDown_selectByVisibleText(WebElement element,String text) {
		
		Select select=new Select(element);
		select.selectByVisibleText(text);
			
	}
	
	public static void handleDropDown_selectByIndex(WebElement element,int index) {
		
		Select select=new Select(element);
		select.selectByIndex(index);
	}
	
	public static void handleDropDown_selectByValue(WebElement element,String value) {
		
		Select select=new Select(element);
		select.selectByValue(value);
	}
	
}
