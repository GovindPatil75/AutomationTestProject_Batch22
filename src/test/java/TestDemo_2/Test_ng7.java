package TestDemo_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageObjectRepo.LoginPom;

public class Test_ng7 extends BrowserLaunch{
	
	
	@Test
	public void verifyLoginFunctionality() {
	
		// WebElement -Action --LoginPom
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		
//		login.getTxt_Email().sendKeys("Test@gmail.com");
//		login.getTxt_password().sendKeys("12345678");
//		login.getBtn_login().click();
		
		Library.custom_SendKeys(login.getTxt_Email(), "Test@gmail.com");
		Library.custom_SendKeys(login.getTxt_password(), "12345678");
		Library.custom_click(login.getBtn_login());
	
		
	}

}
