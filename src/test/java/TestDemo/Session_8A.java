package TestDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Session_8A {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		WebElement Drp_country=driver.findElement(By.xpath("//select[@name='country']"));
		Select sel=new Select(Drp_country);
		
		List<WebElement> list=sel.getOptions();
		
		int AllOption=list.size();
		System.out.println(AllOption); // 264
		
		for(int i=0;i<list.size();i++) {
			
			String Option=list.get(i).getText();
			System.out.println(Option);
			
		}
		

	}

}
