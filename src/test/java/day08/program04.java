package day08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class program04 {
	@Test
	public void edgeuser1(){
		WebDriver driver;
		driver=new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("edge1");
		driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("edge2");
	}
	@Test
	public void edgeuser2(){
		WebDriver driver;
		driver=new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("edge3");
		driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("edge4");
	}
}
