package TestDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Session_7 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		// Element identify Xpath by contains()
		//tagname[conatins(@attribute name,'attribute value')]
		
		WebElement LoginBtn=driver.findElement(By.xpath("//button[contains(@id,'u_0_5_')]"));
		LoginBtn.click();
	}

}
