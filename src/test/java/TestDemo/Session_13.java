package TestDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Session_13 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		// Element1 ---> Element2
		
		//Actions act=new Actions(driver);
		
		WebElement SrcElement=driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		
		WebElement TargetEle=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		//act.dragAndDrop(SrcElement, TargetEle).build().perform();
		
		dragAndDropAction(driver,SrcElement,TargetEle);
	}
	
	
	public static void dragAndDropAction(ChromeDriver driver,WebElement src,WebElement target) {
		Actions act=new Actions(driver);
		act.dragAndDrop(src, target).build().perform();
	}

}
