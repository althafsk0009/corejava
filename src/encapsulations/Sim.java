package encapsulations;

public class Sim {
	private String sprovider;
	private long simno;
	private double balance;
	Sim(){
		
	}
	Sim(String sprovider,long simno,double balance)
	{
		this.sprovider=sprovider;
		this.simno=simno;
		this.balance=balance;
	}
	//getter method
	public String getSprovider()
	{
		return sprovider;
	}
	public long getSimno()
	{
		return simno;
	}
	public double getbalance()
	{
		return balance;
	}
	//setter method
	public void setSprovider(String sprovider)
	{
		this.sprovider=sprovider;
	}
	public void setSimno(long simno)
	{
		this.simno=simno;
	}
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	public void simDetails()
	{
		System.out.println(sprovider);
		System.out.println(simno);
		System.out.println(balance);
	}

}
