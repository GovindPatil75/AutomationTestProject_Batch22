package TestDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Session_5 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		// Identify WebElement  - Xpath --> Absloute XPath
		// we navigate from parent node to immidiate child node 
		
		WebElement Email=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input"));
		//Email.sendKeys("Test@gmail.com");
		
		WebElement password=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/input"));
		//password.sendKeys("12345678");
		
		WebElement LoginBtn=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button"));
		//LoginBtn.click();
		
		actionSendKeys(Email,"Test@gmail.com");
		actionSendKeys(password,"Test@gmail.com");
		actionClick(LoginBtn);
		
	}
   public static void actionSendKeys(WebElement element,String value) {
	   element.sendKeys(value);
    }
	
   public static void actionClick(WebElement element) {
	   element.click();
   }
	
}
