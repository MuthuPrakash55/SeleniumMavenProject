package day11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.internal.util.Durations;

public class program02 {

	public static void main(String[] args) {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(30));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("twotabsearchtextbox")));
	
		Wait x=new FluentWait(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(10));
		x.until(ExpectedConditions.visibilityOfElementLocated(By.id("twotabsearchtextbox1")));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oppo"+Keys.ENTER);
	}

}
