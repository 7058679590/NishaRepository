package dynamicScreenshot;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;


public class customeListener extends BaseTest implements ITestListener {
  @Override
	public void onTestStart(ITestResult result) {
		
		Reporter.log("onTestStart",true);
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		Reporter.log("onTestSuccess",true);
	}

	@Override
	public void onTestFailure(ITestResult result)
	{
		String FailedMethod = result.getMethod().getMethodName();
		Reporter.log(FailedMethod+" :Method failed and taken ScreenShot",true);
		failedmethod(FailedMethod);	
		
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		Reporter.log("onTestSkipped",true);
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		Reporter.log("onTestFailedButWithinSuccessPercentage",true);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) 
	{
		Reporter.log("onTestFailedWithTimeout",true);
	}

	@Override
	public void onStart(ITestContext context)
	{
		Reporter.log("onStart",true);
	}

	@Override
	public void onFinish(ITestContext context) 
	{
		Reporter.log("nFinish",true);
	}


}
