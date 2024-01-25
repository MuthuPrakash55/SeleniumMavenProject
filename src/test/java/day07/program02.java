package day07;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class program02 {
	@Test(groups= {"test abc"})
	public void testcase05() {
		System.out.println("testcase-05");
	}
	@Test(groups= {"test abc","test def"})
	public void testcase06() {
		System.out.println("testcase-06");
	}
	@Test(groups= {"test abc"})
	public void testcase07() {
		System.out.println("testcase-07");
	}
	@Test(groups= {"test abc"})
	public void testcase08() {
		System.out.println("testcase-08");
	}
	@BeforeGroups(groups= {"test abc"})
	public void beforegroups() {
		System.out.println("before group");
	}
	@AfterGroups(groups= {"test abc"})
	public void aftergroups() {
		System.out.println("after group");
	}
}
