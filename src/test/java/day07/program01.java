package day07;

import org.testng.annotations.Test;

public class program01 {
	@Test(groups= {"test abc"})
	public void testcase01() {
		System.out.println("testcase-01");
	}
	@Test(groups= {"abc"})
	public void testcase02() {
		System.out.println("testcase-02");
	}
	@Test(groups= {"test abc"})
	public void testcase03() {
		System.out.println("testcase-03");
	}
	@Test(groups= {"abc"})
	public void testcase04() {
		System.out.println("testcase-04");
	}
}
