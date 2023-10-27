package TestDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Session_7A {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		// Element - xpath By contains()
		//tagname[contains(text(),'static value ')]
		
		WebElement FP=driver.findElement(By.xpath("//a[contains(text(),'Forgotten ')]"));
		FP.click();
		
		
	}

}
