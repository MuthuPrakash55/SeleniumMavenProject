package practice;

import java.io.FileInputStream;
import java.util.Properties;

public class test01 {

	public static void main(String[] args) {
		data();
		

	}
	public static void data() {
		Properties pro=new Properties();
		try {
		FileInputStream stream=new FileInputStream("C:\\Users\\praka\\eclipse-workspace\\SeleniumMavenProject\\src\\test\\java\\practice\\data.properties");
		pro.load(stream);
		System.out.println(pro.get("name"));
	}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
	}
}
