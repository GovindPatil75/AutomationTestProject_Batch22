package TestDemo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Library {
	
	public static Actions getActions(ChromeDriver driver) {
		
		Actions act=new Actions(driver);
		return act;
	}

}
