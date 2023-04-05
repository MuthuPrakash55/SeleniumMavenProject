package day08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class program01 {
 
	WebDriver driver;
	@Parameters({"firstname","lastname"})
	@Test
	public void testcase(String firstname,String lastname){
		driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys(firstname);
		driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys(lastname);
		driver.findElement(By.id("submitbtn")).click();
	}
}
