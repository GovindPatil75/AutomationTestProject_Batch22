package TestDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Session_16 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		// Cust id --Click submit  -- Alert ---How Handle Alert ?
		
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("123456789");
		
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		/*
		Alert alt=driver.switchTo().alert();
		
		String text=alt.getText();
		
		System.out.println(text);
		
		//alt.dismiss(); // cancel button Alert click
		

		alt.accept(); // click OK button 
		
		String text2=alt.getText();
		System.out.println(text2);
		
		alt.accept(); // Ok button Click
		*/
		
		getalertHandler(driver).getText();
		getalertHandler(driver).accept();
		getalertHandler(driver).dismiss();
		getalertHandler(driver).sendKeys("Test");
		
		alertHandler_gettext(driver);
		alertHandler_clickonOk(driver);
		alertHandler_clickonCancel(driver);
		
		alertHandler_UserInputOnalert(driver,"Test");
		
	}
	
	
	
	public static Alert getalertHandler(ChromeDriver driver) {
		
		return driver.switchTo().alert();
	}

	
   public static String alertHandler_gettext(ChromeDriver driver) {
		
		 return driver.switchTo().alert().getText();
	}
   
   public static void alertHandler_clickonOk(ChromeDriver driver) {
		
		 driver.switchTo().alert().accept();;
	}
   public static void alertHandler_clickonCancel(ChromeDriver driver) {
		
		 driver.switchTo().alert().dismiss();
	}
   
   public static void alertHandler_UserInputOnalert(ChromeDriver driver,String input) {
		
		 driver.switchTo().alert().sendKeys(input);
	}
}
