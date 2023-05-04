package encapsulations;

public class Whatsup {
	private String username;
	private long cno;
	private int pwd;
	private String status;
	public  Whatsup(String username,long cno,int pwd,String status);
	{
		this.username=username;
		this.cno=cno;
		this.pwd=pwd;
		this.status=status;
	}
	//getter method
	
	public String getUsername()
	{
		return username;
	}
	//setter method
	public void setUsername(String usernmae)
	{
		this.username=username;
	}
	public void WhatsupDetails()
	{
		System.out.println(username);
		System.out.println(cno);
		System.out.println(pwd);
		System.out.println(status);
		
	}
	

}
