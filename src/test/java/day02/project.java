package day02;

public class project extends framework {

	public static void main(String[] args) {
		startReport("first application");
		startTest("demo1", "testing application1");
		browser("edge");
		windowmax();
		appurl("https://accounts.google.com/signup");
		//appurl("https://letcode.in/alert");
		typeinput("//input[@name='firstName']", "testA","firstName");
		typeinput("//input[@name='lastName']", "testA","lastname");
		click("//input[@type='checkbox']","showpassword");
		clearall("//input[@name='firstName']","firstName");
		//click("//*[@id=\"prompt\"]","prompt box");
		//typeinalert("vijay prakash","alert box");
		//alertok();
		endtest();
		endReport();
	}

}
