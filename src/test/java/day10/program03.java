package day10;

public class program03 {

	public static void main(String[] args) {
		int x=10;
		int y=0;
				
		System.out.println(x+y);
		System.out.println(x-y);
		try {
			System.out.println(x/y);
		}
		finally {
			System.out.println("final block");
			x=10;
			y=5;
		}
		System.out.println(x*y);
		System.out.println((x*x)+(y*y));
	}

}
