package nonprimitivetypecasting;

public class Son1  extends Father1{
	int age = 17;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Father1 f = new Son1();
		System.out.println(f.name);
		
		System.out.println("........");
		
		Son1 s =(Son1)f;
		System.out.println(s.name);
		System.out.println(s.age);
		

	}

}
