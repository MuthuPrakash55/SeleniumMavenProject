package day09;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listener implements ITestListener{
	Framework framework;
	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("start test");
	}
	
	@Override
	public void onFinish(ITestContext context) {
		System.out.println("end test");
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		try {
			framework.browserrefresh();
			System.out.println("test failed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	

