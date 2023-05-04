package exception;

import java.util.Scanner;

public class Project2 {

	public static void main(String[] args) {
		System.out.println("Main Start");
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter number A");
			int a = s.nextInt();
			System.out.println("Enter number B");
			int b = s.nextInt();
			 try
			 {
				 System.out.println(a/b);
			 }
			 catch(ArithmeticException e)
			 {
				 System.out.println("Cannot drivide by zero");
			 }
		}
		System.out.println("Main End");
	}

}
