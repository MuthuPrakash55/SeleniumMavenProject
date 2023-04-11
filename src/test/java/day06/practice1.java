package day06;

import org.junit.jupiter.api.RepeatedTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class practice1 {
	WebDriver driver;
	/*@BeforeTest
	public void browserurl() {
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}*/
	@Test(invocationCount = 2,priority = 1)
	public void register() {
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement search=driver.findElement(By.xpath("//input[@type=\"text\"]"));
		search.sendKeys("java"+Keys.ENTER);
		//driver.findElement(By.xpath("//input[@type=\"text\"]")).clear();
	}
	/*@Test(priority = 2)
	public void mousehover() {
		Actions act=new Actions(driver);
		WebElement sign=driver.findElement(By.xpath("//a[@id=\"nav-link-accountList\"]"));
		act.moveToElement(sign).build().perform();
	}
	@AfterTest
	public void quit() {
		driver.quit();
	}*/
}
