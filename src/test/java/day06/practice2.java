package day06;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class practice2 {
	WebDriver driver;
	@BeforeTest
	public void browserurl1() {
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}
	@Test(priority = 3,invocationCount = 2)
	public void register1() {
		WebElement search=driver.findElement(By.xpath("//input[@type=\"text\"]"));
		search.clear();
		search.sendKeys("python"+Keys.ENTER);
		
	}
	@Test(priority = 4)
	public void mousehover1() {
		Actions act=new Actions(driver);
		WebElement sign=driver.findElement(By.xpath("//a[@id=\"nav-link-accountList\"]"));
		act.moveToElement(sign).build().perform();
	}
}
