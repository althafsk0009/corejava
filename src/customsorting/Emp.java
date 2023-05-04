package customsorting;

public class Emp {
	int id;
	String name;
	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@override
	public String toString()
	{
		return name+" "+id;
	}
	

}
