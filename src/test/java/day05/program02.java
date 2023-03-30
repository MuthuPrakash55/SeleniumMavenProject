package day05;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class program02 {
	
	@Test
	public void testcase1(){
		System.out.println("login IN");
	}
	@Test
	public void testcase2(){
		System.out.println("login out");
	}
	@Before
	public void beforetestcase(){
		System.out.println("open browser");
	}
	@After
	public  void aftertestcase(){
		System.out.println("close browser");
}
}
