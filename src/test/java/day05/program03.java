package day05;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class program03 {
	
	@Test
	public void testcase1() {
		System.out.println("open browser");
	}
	@Test
	public void testcase2() {
		System.out.println("enter user name");
	}
	@Test
	public void testcase3() {
		System.out.println("enter password");
	}
	@Disabled  //in junit-5 disabled is used to ignore the test case
	public void testcase4() {
		System.out.println("*********");
	}
	@Test
	public void testcase5() {
		System.out.println("click login");
	}
	@BeforeAll
	public static void beforeall() {
		System.out.println("before all--@@@@@@");
	}
	@AfterAll
	public static void afterall() {
		System.out.println("after all--@@@@@@");
	}
}
