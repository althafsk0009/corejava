package interfaces;

public class Emp extends TestYantra implements Qspiders,Jspiders{
	
	public void test()
	{
		System.out.println("testing");
	}
	public void develop()
	{
		System.out.println("devloping");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Emp e = new Emp();
		e.test();
		e.develop();
		e.work();

	}

}
