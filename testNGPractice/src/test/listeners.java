package test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listeners implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("on test start "+result.getName());

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("on test success "+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("on test Failure "+result.getName());

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("on test skipped "+result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	@Override
	public void onStart(ITestContext context) {
		
		System.out.println("on start "+context.getName());
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
		System.out.println("on Finish "+context.getName());
		
	}

}
