package practice;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class testng {
			static  ExtentReports report;
			static ExtentTest test;
			WebDriver driver;
	
	@BeforeClass	
	public void before() {
		report=new ExtentReports(
				"./src/test/resources/extentreport.html");
	}
	@Test
	public void login() throws IOException {
		test=report.startTest("login", "user can able to login");
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/V1/index.php");
		driver.findElement(By.xpath("//input[@name=\"uid\"]")).sendKeys("mngr486474");
		test.log(LogStatus.INFO,"user is able to enter name");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("bemajat");
		test.log(LogStatus.INFO,"user is able to enter password",test.addScreenCapture(capturescreen(driver, "image")));
		driver.findElement(By.xpath("//input[@name=\"btnLogin\"]")).click();
		test.log(LogStatus.INFO, "test is passed"+test.addScreenCapture(capturescreen(driver,"image1")));
	
	}
	
	@AfterClass
	public void teardown() {
		report.endTest(test);
		report.flush();
	}
	public String capturescreen(WebDriver driver,String filename) throws IOException {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des=new File("./screenshot/"+filename+".png");
		String destination=des.getAbsolutePath();
		FileUtils.copyFile(src, des);
		return destination;
	}
}
