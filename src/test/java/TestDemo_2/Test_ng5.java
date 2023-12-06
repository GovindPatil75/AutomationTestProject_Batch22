package TestDemo_2;

import org.testng.annotations.Test;

public class Test_ng5 {
	
	
	@Test(groups= {"Regression"})
	public void f1() {
		System.out.println("Test F1");
	}

	@Test(groups= {"Critical Regression"})
	public void f2() {
		System.out.println("Test F2");
	}
	
	@Test(groups= {"Critical Regression"})
	public void f3() {
		System.out.println("Test F3");
	}
	
	@Test(groups= {"Critical Regression"})
	public void f4() {
		System.out.println("Test F4");
	}
	
}
