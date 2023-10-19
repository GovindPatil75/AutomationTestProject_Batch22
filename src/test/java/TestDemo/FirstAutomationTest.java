package TestDemo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstAutomationTest {

	public static void main(String[] args) {
		
		//Chrome Browser 
		
		// Browser execution -- Browser executable setup 
		WebDriverManager.chromedriver().setup();
		
		// Browser driver class - Object
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/login.php");
		
		driver.manage().window().maximize();
		
		// Edge Browser 
		
		// Browser execution -- Browser executable setup 
		WebDriverManager.edgedriver().setup();
		// Browser driver class - Object
		EdgeDriver driver1=new EdgeDriver();
		
		driver1.get("https://mvnrepository.com/");
		
		driver1.manage().window().maximize();
		
		
		

	}

}
