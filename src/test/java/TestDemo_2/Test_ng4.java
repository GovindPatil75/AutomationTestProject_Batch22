package TestDemo_2;

import org.testng.annotations.Test;

public class Test_ng4 {
	
	
	@Test(groups= {"Regression" ,"Critical Regression"})
	public void r1() {
		System.out.println("Test R1");
	}

	@Test(groups= {"Critical Regression"})
	public void r2() {
		System.out.println("Test R2");
	}
	
	@Test(groups= {"Regression"})
	public void r3() {
		System.out.println("Test R3");
	}
	
	
}
