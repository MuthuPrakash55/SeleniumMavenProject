package day06;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class program06 {
	@BeforeMethod
	public void beforetest() {
		System.out.println("before test");
	}
	@AfterMethod
	public void aftertest() {
		System.out.println("after test");
	}
	@Test
	public void testcase1() {
		System.out.println("TC-01");
	}
	@Test
	public void testcase2() {
		System.out.println("TC-02");
	}
	@Test
	public void testcase3() {
		System.out.println("TC-03");
	}
	
}
