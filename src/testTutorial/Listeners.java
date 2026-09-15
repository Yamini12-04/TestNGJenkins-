package testTutorial;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
	
	  @Override
	  public void onTestStart(ITestResult result) {    
	  }

	  @Override
	  public  void onTestSuccess(ITestResult result) {
		  System.out.println("I am a listener and test on success i am executing in output");
	    
	  }

	  @Override
	  public void onTestFailure(ITestResult result) {
		  System.out.println("THIS METHOD IS FAILED");
		  System.out.println("Name of the method " +result.getName());	   
		  System.out.println("Name of the class " +result.getClass());
	  }

	  @Override
	  public void onTestSkipped(ITestResult result) {
		  
	    System.out.println("This test is skipped " +result.getName());
	  }

	  @Override
	  public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	    // not implemented
	  }

	  @Override
	  public  void onTestFailedWithTimeout(ITestResult result) {
	    onTestFailure(result);
	  }

	  @Override
	  public void onStart(ITestContext context) {
	    // not implemented
	  }

	  @Override
	  public void onFinish(ITestContext context) {
	    
	  }
	

}
