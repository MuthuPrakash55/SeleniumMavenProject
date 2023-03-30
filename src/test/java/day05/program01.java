package day05;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class program01 {
	@BeforeClass
	public static void beforetestcase(){
		System.out.println("open browser");
	}
	@Test
	public void testcase1(){
		System.out.println("login IN");
	}
	// in junit 4--->ignore is used to ignore the test case
	// in junit-5--->disabled is used to ignore the test case
	@Ignore 
	public void testcase2(){
		System.out.println("enter user name");
	}
	@AfterClass
	public static void aftertestcase(){
		System.out.println("close browser");
}
	@Test
	public void testcase3() {
		System.out.println("enter password");
	}
	@Test
	public void testcase4() {
		System.out.println("click login");
	}
}
