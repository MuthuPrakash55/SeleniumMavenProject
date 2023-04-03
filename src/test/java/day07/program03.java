package day07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class program03 {
	WebDriver driver;
	@Test(dataProvider = "demo")
	public void testcase(String firstname,String lastname){
		driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys(firstname);
		driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys(lastname);
		driver.findElement(By.id("submitbtn")).click();
	}
	@DataProvider(name="demo")
	public Object[][] testdata1(){
		return new Object[][] {{"vijay","prakash"},{"testA","testB"},{"testC","testD"}};
	}
	
}
