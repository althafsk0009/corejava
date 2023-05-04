package encapsulations;

public class Sdriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sim s = new Sim();
		//Sim s = new Sim("Jio",987654,99.99);
		System.out.println(s.getSprovider());
		System.out.println(s.getbalance());
		System.out.println(s.getSimno());
		System.out.println("-------");
		s.setSprovider("Airtel");
		s.setSimno(987654);
		s.setBalance(99.99);
		s.simDetails();
		

	}

}
