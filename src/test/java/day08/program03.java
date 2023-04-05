package day08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class program03 {
	@Test
	public void chromeuser1(){
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("chrome1");
		driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("chrome2");
	}
	@Test
	public void chromeuser2(){
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("chrome3");
		driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("chrome4");
	}
}
