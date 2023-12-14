package TestDemo_2;

import org.openqa.selenium.WebElement;

public class Library {

	
	public static void custom_SendKeys(WebElement element,String Value) {
		
		try {
			element.sendKeys(Value);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void custom_click(WebElement element){
		
		try {
			element.click();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
