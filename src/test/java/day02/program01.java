package day02;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class program01 {
	static ExtentReports report;
	static ExtentTest test;
	public static void main(String[] args) {
		report=new ExtentReports(".\\src\\test\\resources\\march23.html");
		test=report.startTest("LOGIN-1", "Verify that user can able to login with valid data");
		
		test.log(LogStatus.INFO, "open chrome browser");
	
		test.log(LogStatus.INFO, "open application url");
	
		test.log(LogStatus.INFO, "Enter username");
	
		test.log(LogStatus.INFO, "Enter password");
	
		test.log(LogStatus.INFO, "click login");
	
		report.endTest(test);
		
		test=report.startTest("LOGIN-2", "verify that user can able to signin with invalid data");
		
		test.log(LogStatus.INFO, "open chrome browser");
	
		test.log(LogStatus.INFO, "open application url");
		
		test.log(LogStatus.INFO, "enter invalid username");
	
		test.log(LogStatus.INFO, "enter invalid password");
	
		test.log(LogStatus.INFO, "click login");
		
		report.endTest(test);
		
		report.flush();
	}

}
