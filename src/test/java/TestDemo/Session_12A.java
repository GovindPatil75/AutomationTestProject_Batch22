package TestDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Session_12A {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		// Element -Right click
		//Actions act=new Actions(driver);
		
		WebElement RightElement=driver.findElement(By.xpath("//span[text()='right click me']"));
		
		// right click
		//act.contextClick(RightElement).build().perform();
		
		//right click +option click
		
		WebElement Quit=driver.findElement(By.xpath("//span[text()='Quit']"));
		
		//act.contextClick(RightElement).click(Quit).build().perform();
		
		WebElement DoubleClickElement=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		//act.doubleClick(DoubleClickElement).build().perform();

		Library.getActions(driver).doubleClick(DoubleClickElement).build().perform();
	}

}
