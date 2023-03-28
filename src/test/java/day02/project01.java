package day02;

public class project01 extends framework {
	
	public static void main(String[] args) {
		startReport("frame");
		startTest("I FRAME","verify user can able to switch to frame and enter the input");
		browser("chrome");
		windowmax();
		appurl("https://letcode.in/frame");
		framebynameid("firstFr","name");
		typeinput("/html/body/app-root/app-frame-content/div/div/form/div[1]/div/input","vijay","First name");
		mainframe();
		click("//*[@id=\"navbar-menu\"]/div[1]/a[3]", "homelogo");
		endReport();
		endtest();
	}

}
