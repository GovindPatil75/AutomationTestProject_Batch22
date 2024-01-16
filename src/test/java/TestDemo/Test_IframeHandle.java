package TestDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_IframeHandle {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		//Mainpage -1 st frame 
		WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Test");
		
		driver.switchTo().defaultContent(); //Mainpage <-1 st frame
		
		//Mainpage --2nd frame 
		WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Test 1");
		
		driver.switchTo().defaultContent(); //Mainpage <--2nd frame
		
		// MainPage --frame3 ---innerFrame
		
		WebElement Frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(Frame3); //MainPage --frame3 
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Test 2");
		
		WebElement innerframe=driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(innerframe); //frame3 --->innerFrame
		
		driver.findElement(By.xpath("(//div[@class='AB7Lab Id5V1'])[1]")).click();
		
		//
		driver.switchTo().parentFrame(); // frame3 <---innerFrame
		driver.switchTo().defaultContent();//MainPage <--frame3
		
		//MainPage 
	}

}
