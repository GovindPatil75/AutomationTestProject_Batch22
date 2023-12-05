package TestDemo_2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_ng1 {
	
	
	@Test(priority=1)
	public void xyz() {
		System.out.println("Test XYZ");
	}
	
	@Test(priority=-2,enabled=false)
	public void abc() {
		System.out.println("Test ABC");
	}
	
	@Test(priority=0,invocationCount=3)
	public void pqr() {
		System.out.println("Test PQR");
	}
	
	@Test(priority=2)
	public void LoginTest() {
		System.out.println("Login Test");
		Assert.assertTrue(false); // fail
	}
	
	@Test(priority=3,dependsOnMethods="LoginTest")
	public void HomepageTest() {
		System.out.println("Homepage Test");
	}
	

}
