package day10;

public class program04 {
	int a;
	int b;
	public program04(){
		System.out.println("program04 is started");
	}
	private program04(int a,int b){
		this.a=a;
		this.b=b;
	}

	public static void main(String[] args) {
		program04 pro=new program04(20,30);
		System.out.println(pro.a+pro.b);
	}

}
