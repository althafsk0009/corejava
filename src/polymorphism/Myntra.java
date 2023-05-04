package polymorphism;

public class Myntra {
	void purchase(String product)
	{
		System.out.println(product);
	}
	void purchase(String product, int cost)
	{
		System.out.println(product+" "+cost);
		
	}
	void purchase( int cost, String product)
	{
		System.out.println(cost +" "+product);
	}
	void purchase(int cost)
	{
		System.out.println(cost);
	}

}
