package interfaces;

public class AccHolder implements ReserveBank,SBI{
	
	public void deposit()
	{
		System.out.println("deposit money");
	}
    public void withdraw()
    {
    	System.out.println("withdraw money");
    }
    public void balance()
    {
    	System.out.println("check balance");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccHolder a = new AccHolder();
		a.balance();
		a.deposit();
		a.withdraw();

	}

}
