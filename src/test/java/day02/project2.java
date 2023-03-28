package day02;

public class project2 extends framework {

	public static void main(String[] args) {
		startReport("demo1");
		startTest("Select"," verify that user can able to select");
		browser("chrome");
		appurl("https://letcode.in/dropdowns");
		seldropdownbyindex("//select[@id='fruits']", 2, "Fruits");
		endtest();
		endReport();
		
	}

}
