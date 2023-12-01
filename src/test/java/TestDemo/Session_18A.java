package TestDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Session_18A {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        
       // JavascriptExecutor js=(JavascriptExecutor) driver;
           //Scroll By Pixel
        //Top-bottom 
       // js.executeScript("window.scrollBy(0,500)", "");
        
       // Thread.sleep(3000);
        //Bottom-top
        //js.executeScript("window.scrollBy(0,-500)","");
        
        WebElement EnglishUK=driver.findElement(By.xpath("//li[text()='English (UK)']"));
        
        //js.executeScript("arguments[0].scrollIntoView();", element);
        
        
        ScrollByElement(driver,EnglishUK);
	}

	public static void ScrollByElement(WebDriver driver,WebElement element) {
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView();", element);
		
		
	}
	
}
