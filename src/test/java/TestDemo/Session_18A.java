package TestDemo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Session_18A {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        
        JavascriptExecutor js=driver;
        //Top-bottom 
        js.executeScript("window.scrollBy(0,500)", "");
        
        Thread.sleep(3000);
        //Bottom-top
        js.executeScript("window.scrollBy(0,-500)","");
	}

}
