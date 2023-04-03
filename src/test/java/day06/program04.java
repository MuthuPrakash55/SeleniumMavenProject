package day06;

import org.testng.annotations.Test;

public class program04 {
	@Test(invocationCount = 5,priority = 5)
	public void testcase1() {
		System.out.println("TC-01");
	}
	@Test(priority = 4)
	public void testcase2() {
		System.out.println("TC-02");
	}
	@Test(priority = 2)
	public void testcase3() {
		System.out.println("TC-03");
	}
	@Test(priority = 3)
	public void testcase4() {
		System.out.println("TC-04");
	}
	@Test(priority = 1)
	public void testcase5() {
		System.out.println("TC-05");
	}
}
