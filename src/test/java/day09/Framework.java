package day09;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Framework {
	public static WebDriver driver;
	public static  WebDriver browser(String browservalue) {
		switch (browservalue) {
		case "chrome":
			driver=new ChromeDriver();
			break;
		case "edge":
			driver=new EdgeDriver();
			break;
		case "firefox":
			driver=new FirefoxDriver();
			break;
		case "ie":
			driver=new InternetExplorerDriver();
			break;
		}
		return driver;
	}
	public static void appurl(String url) {
		driver.get(url);
	}
	public static void typeinput(String Xpathvalue,String datavalue) {
		driver.findElement(By.xpath(Xpathvalue)).sendKeys(datavalue);
	}
	public static void click(String Xpathvalue) {
		driver.findElement(By.xpath(Xpathvalue)).click();
	}
	public static void clearall(String Xpathvalue) {
		driver.findElement(By.xpath(Xpathvalue)).clear();
	}
	public static void seldropdownbyindex(String Xpathvalue,int datavalue) {
		Select dropdown=new Select(driver.findElement(By.xpath(Xpathvalue)));
		dropdown.selectByIndex(datavalue);
		}
	public static void seldropdownbyvalue(String Xpathvalue,String datavalue) {
		Select dropdown=new Select(driver.findElement(By.xpath(Xpathvalue)));
		dropdown.selectByValue(datavalue);
	}
	public static void seldropdownbytext(String Xpathvalue,String datavalue) {
		Select dropdown=new Select(driver.findElement(By.xpath(Xpathvalue)));
		dropdown.selectByVisibleText(datavalue);
	}
	public static void windowmax() {
		driver.manage().window().maximize();
	}
	public static void windowmin() {
		driver.manage().window().minimize();
	}
	public static void windowfull() {
		driver.manage().window().fullscreen();
	}
	public static void browserback() {
		driver.navigate().back();
	}
	public static void browserforward() {
		driver.navigate().forward();
	}
	public static void browserrefresh() {
		driver.navigate().refresh();
	}
	public static void close() {
		driver.close();
	}
	public static void quit() {
		driver.quit();
	}
	public static String getpagetitle() {
		 return driver.getTitle();
	}
	public static String getcurrenturl() {
		return driver.getCurrentUrl();
	}
	public static void alertok() {
		driver.switchTo().alert().accept();
	}
	public static void alertcancel() {
		driver.switchTo().alert().dismiss();
	}
	public static void typeinalert(String datavalue) {
		driver.switchTo().alert().sendKeys(datavalue);
	}
	public static String getalerttext() {
		return driver.switchTo().alert().getText();
	}
	public static Set<String> windowhandles() {
		return driver.getWindowHandles();
	}
	public static String windowhandle() {
		return driver.getWindowHandle();
	}
	public static void framebynameid(String nameid) {
		driver.switchTo().frame(nameid);
	}
	public static void framebyindex(int index) {
		driver.switchTo().frame(index);
	}
	public static void framebyxpath(String xpathvalue) {
		driver.switchTo().frame(driver.findElement(By.xpath(xpathvalue)));
	}
	public static void mainframe() {
		driver.switchTo().defaultContent();
	}
	public static void ActionDropDown(String src,String target)  {
		Actions act=new Actions(driver);
		WebElement src1=driver.findElement(By.xpath(src));
		WebElement target1=driver.findElement(By.xpath(target));
		act.dragAndDrop(src1, target1).build().perform();
	}
	public static void Actiondoubleclick(String xpathvalue) {
		Actions act=new Actions(driver);
		WebElement src=driver.findElement(By.xpath(xpathvalue));
		act.doubleClick(src).build().perform();
	}
	public static void Actionnormalclick(String xpathvalue) {
		Actions act=new Actions(driver);
		WebElement src=driver.findElement(By.xpath(xpathvalue));
		act.click(src).build().perform();
	}
	public static void Actionrightclick(String xpathvalue) {
		Actions act=new Actions(driver);
		WebElement src=driver.findElement(By.xpath(xpathvalue));
		act.contextClick(src).build().perform();
	}
	public static void screenshot(String filename) throws IOException {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des=new File("./screenshot/"+filename+".png");
		FileUtils.copyFile(src, des);
	}
	public static void actionmousehover(String xpathvalue) {
		Actions act=new Actions(driver);
		WebElement src=driver.findElement(By.xpath(xpathvalue));
		act.moveToElement(src).build().perform();;
	}
	public static List<String> Webtable(String Xpathvalue){
		List<WebElement> rowcolumn=driver.findElements(By.xpath(Xpathvalue));
		List<String> rowcolumnlist=new ArrayList<>();
		for(WebElement name:rowcolumn) {
			rowcolumnlist.add(name.getText());
		}
		return rowcolumnlist;
}

}

