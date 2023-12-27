package day09;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listener.class)
public class program01 extends Framework {
	@Test
	public void testcase(){
//		driver=new ChromeDriver();
//		driver.get("https://demo.automationtesting.in/Register.html");
		browser("chrome");
		appurl("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("chrome1");
		driver.findElement(By.xpath("//input[@placeholder=\"Last Nam\"]")).sendKeys("chrome2");
	}
}
