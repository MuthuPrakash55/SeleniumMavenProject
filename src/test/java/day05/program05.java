package day05;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class program05 {
	@Test
	public void testcase1() {
		System.out.println("enter username");
	}
	@Test
	public void testcase2() {
		System.out.println("enter password");
	}
	
	public void testcase3() {
		System.out.println("click login");
	}
	@BeforeEach
	public void beforeeach() {
		System.out.println("<----open browser---->");
	}	
	@AfterEach
	public void aftereach() {
		System.out.println("<@@@@close browser@@@@>");
	}
	@BeforeAll
	public static void beforeall() {
		System.out.println("before all---@@@@@@");
	}
	@AfterAll
	public static void afterall() {
		System.out.println("after all--########");
	}
}
