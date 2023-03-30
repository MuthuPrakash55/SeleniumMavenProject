package day05;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class program04 {
	@RepeatedTest(5)
	public void testcase1() {
		System.out.println("log-IN");
	}
	@Test
	public void testcase2() {
		System.out.println("log=OUT");
	}
}
