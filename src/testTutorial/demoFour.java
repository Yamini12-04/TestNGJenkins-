package testTutorial;

import org.testng.annotations.Test;

public class demoFour {
	
	@Test(groups= {"Smoke"})
	public void WebLoginloanHome() {
		System.out.println("Web Login Home loan");
	}
	
	@Test
	public void MobileLoginloanHome() {
		System.out.println("Mobile Login Home loan");
	}
	
	@Test
	public void ApiLoginloanHome() {
		System.out.println("Api Login Home loan");
	}

}
