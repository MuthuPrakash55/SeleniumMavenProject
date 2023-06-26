package practice1;

			import java.io.File;
			
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
			
			import practice.excelDataSupllier;
			
			public class Testng {
				static  ExtentReports report;
				static ExtentTest test;
				WebDriver driver;
			
			@BeforeClass	
			public void before() {
			report=new ExtentReports(
					"./src/test/resources/extentreport.html");
			}
			@Test(dataProvider = "login",dataProviderClass = excelData.class)
			public void login(String username,String password) throws Exception {
			test=report.startTest("login", "user can able to login");
			driver=new ChromeDriver();
			driver.get("https://demo.guru99.com/V1/index.php");
			driver.findElement(By.xpath("//input[@name=\"uid\"]")).sendKeys(username);
			test.log(LogStatus.INFO,"user is able to enter name",test.addScreenCapture(capturescreen(driver, "image2")));
			driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(password);
			test.log(LogStatus.INFO,"user is able to enter password",test.addScreenCapture(capturescreen(driver, "image")));
			driver.findElement(By.xpath("//input[@name=\"btnLogin\"]")).click();
			test.log(LogStatus.INFO, "test is passed"+test.addScreenCapture(capturescreen(driver,"image1")));
			System.out.println(driver.getTitle());
			if(driver.getTitle().equals("Gtpl Bank New Customer Entry Page ")) {
				test.log(LogStatus.INFO, "user is login with valid credentials",test.addScreenCapture(capturescreen(driver,"image2")));
				System.out.println("test is passed");
			}
			else if(driver.getTitle().equals("GTPL Bank Manager HomePage")){
				System.out.println("test is passed");
			}
			report.endTest(test);
			}
			
			@AfterClass
			public void teardown() {		
			report.flush();
			}
			public String capturescreen(WebDriver driver,String filename) throws Exception  {
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File des=new File("./screenshot/"+filename+".png");
			String destination=des.getAbsolutePath();
			FileUtils.copyFile(src, des);
			return destination;
			}
			}
