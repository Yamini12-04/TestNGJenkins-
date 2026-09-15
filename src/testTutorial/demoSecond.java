package testTutorial;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class demoSecond {
	
	
	@Test
	public void second() {
		System.out.println("Good");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("I am executing after method");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I am executing before method");
	}
	
	@Test(groups= {"Smoke"})
	public void test2() {
		System.out.println("I am a Test2");
	}
	
	@Test
	public void test3() {
		System.out.println("I am a Test3");
		Assert.assertTrue(false);
	}
	

}
