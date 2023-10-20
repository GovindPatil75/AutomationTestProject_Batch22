package TestDemo;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Session_2 {

	public static void main(String[] args) throws Exception {
		
		//setup executable
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login.php");
		driver.manage().window().maximize();
		
		//
		String Title=driver.getTitle();
		System.out.println(Title); // Log in to Facebook
		
		
		String Url=driver.getCurrentUrl();
		System.out.println(Url); // https://www.facebook.com/login.php
		
		//driver.close(); // current open window -- close 
		
		//driver.quit(); //current window + All open window -- close 

		driver.navigate().to("https://mvnrepository.com/");
		
		Thread.sleep(3000); //3 sec
		
		driver.navigate().back(); 
		
		Thread.sleep(3000); //3 sec
		
		driver.navigate().forward();
		
		Thread.sleep(3000); //3 sec
		
		driver.navigate().refresh();
		
		
	}

}
