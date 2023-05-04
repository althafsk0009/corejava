package exception;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		
		System.out.println("Main Start");
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter number A");
			int a =s.nextInt();
			System.out.println("Enter number B");
			int b =s.nextInt();
			System.out.println(a/b);
		}
		System.out.println("Main End");
		

	}

}
