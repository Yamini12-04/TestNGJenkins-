package testTutorial;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class testDemo {
	
	@AfterTest
	public void lastExecution() {
		System.out.println("I will execute at the end");
	}
	
	@Test
	public void modified() {
		System.out.println("Modified test");
	}
	
	
	@Test(dataProvider = "getData")
	public void demo(String usname, String passwd) {
		System.out.println("Hello");
		System.out.println("The username is " +usname);		
		System.out.println("The password is " +passwd);
	}
	
	@Test
	public void secondclass() {
		System.out.println("Bye");
	}
	
	@BeforeTest
	public void firstExecution() {
		System.out.println("I will execute first");
	}
	
	@DataProvider
	public Object[][] getData() {
		// 1st combination Username and password  - good credit history
		// 2nd combination Username and password - no credit history
		// 3rd combination Username and password
		
		Object[][] data = new Object[3][2];
		
		//1st combination
		data[0][0] = "Firstusername";
		data[0][1] = "Password";
		
		//2nd combination
		data[1][0] = "secondusername";
		data[1][1] = "secondPassword";
		
		//3rd combination
		data[2][0] = "Thirdusername";
		data[2][1] = "ThridPassword";
		
		return data;
	}

}
