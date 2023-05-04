package instanceoff;

public class Driver1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father f = new Daughter();
		if(f instanceof Son)
		{
			System.out.println("Downcasr to Son");
			Son s = (Son)f;
			System.out.println(s.x+" "+s.y);
		}
		else if (f instanceof Daughter)
		{
			System.out.println("Downcast to Daughter");
			Daughter d = (Daughter)f;
			System.out.println(d.x+" "+d.z);
		}

	}

}
