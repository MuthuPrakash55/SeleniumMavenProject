package day04;

public class project extends framework {

	public static void main(String[] args) throws Exception {
		startReport("google signin");
		startTest("login","verify that user can able to login");
		browser("chrome");
		windowmax();
		
		appurl("https://accounts.google.com/signup");		
		typeinput("firstname");
		typeinput("lastname");
		click("showpassword");
		clearall("firstname");
		
		/*appurl("https://letcode.in/dropdowns");
		seldropdownbyindex("fruits");*/
		
		/*appurl("https://letcode.in/alert");
		click("promptalert");
		typeinalert("yourname");
		alertok();*/
		
		/*appurl("https://letcode.in/advancedtable");
		Webtable("table");*/
		
		endtest();
		endReport();
	}

}
