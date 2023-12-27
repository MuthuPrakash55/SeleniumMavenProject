package day06;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class practice3 {

	@BeforeClass
	public void beforeclass() {
		System.out.println("before class");
	}
	@Test(invocationCount = 2)
	public void test1() {
		System.out.println("test01");
	}
	@Test
	public void test2() {
		System.out.println("test02");
	}
	@AfterClass
	public void afterclass() {
		System.out.println("after class");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("after test");
	}
	@BeforeTest
	public void beforetest() {
		System.out.println("before test");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("before metod");
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("after method");
	}
}
