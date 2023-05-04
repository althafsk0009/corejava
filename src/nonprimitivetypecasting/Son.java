package nonprimitivetypecasting;

public class Son extends father {
	int y = 20;
	public static void main(String[] args) {
		Son s = new Son();
		Father f1 = s;
		System.out.println(f1.x);
		
		Father f = new Son();
		System.out.println(f.x);
	
		
	}
	

}
