package testTutorial;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class demoThird {
	
	@Test
	public void WebLoginloanCar() {
		System.out.println("Web Login Car loan");
	}
	
	@Test(dependsOnMethods= {"MobilesignoutloanCar"})
	public void MobilesigninloanCar() {
		System.out.println("Mobile signin Car loan");
	}
	
	@Parameters({"URL"})
	@Test
	public void MobilesignoutloanCar(String urlname) {
		System.out.println("Mobile signout Car loan");
		System.out.println(urlname);
	}
	
	@Test(groups= {"Smoke"})
	public void MobileLoginloanCar() {
		System.out.println("Mobile Login Car loan");
	}
	
	@Test(enabled=false)
	public void ApiLoginloanCar() {
		System.out.println("Api Login Car loan");
	}

}
