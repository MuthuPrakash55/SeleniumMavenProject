package day10;

public class program06 {

	public static void main(String[] args) throws testexception {
		int x=10;
		int y=0;
		
		System.out.println(x+y);		
		System.out.println(x-y);
		if(y==0) {
			throw new testexception("y value is zero");
		}
		System.out.println(x/y);
		System.out.println(x*y);
		System.out.println((x*x)+(y*y));

	}

}
