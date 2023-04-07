package day10;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class program02 {

	public static void main(String[] args) {
		int x=10;
		int y=5;
		
		System.out.println(x+y);
		System.out.println(x-y);
		try {
			System.out.println(x/y);
			FileUtils.copyFile(new File(""), new File(""));
		}
		catch(IOException e){
			System.out.println("Io Exception"+e.getMessage());
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic exception"+e.getMessage());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(x*y);
		System.out.println((x*x)+(y*y));
		
	}

}
