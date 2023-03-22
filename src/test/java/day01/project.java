package day01;

public class project extends framework {

	public static void main(String[] args) {
		browser("edge");
		appurl("https://letcode.in/advancedtable");
		windowmax();
		//typeinput("//input[@id='fullName']","vijay");
		System.out.println(getpagetitle());
		//actionmousehover("//*[@id=\"navbar-menu\"]/div[1]/div[2]/a");
		
		System.out.println(Webtable("//table[@name=\"table\"]//tbody//tr[1]//td"));
		click("//a[@class='navbar-item is-primary is-tab']");
		click("//a[text()='Explore Workspace']");
		click("//a[@href=\"/alert\"]");
		click("//*[@id=\"prompt\"]");
		typeinalert("vijay prakash");
		alertok();
	}

}
