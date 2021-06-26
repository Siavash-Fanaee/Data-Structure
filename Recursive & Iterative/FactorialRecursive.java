package workbook08;

import java.util.Scanner;

public class FactorialRecursive {
		
	//Using constructor to create scanner, get number from client, invoke calculator and print the result
	public FactorialRecursive () {
		int n = 0;
		Scanner scn = new Scanner(System.in);
		System.out.print("\nEnter an Integer to calculate its factorial using Recursive Mehthod: ");
		n = scn.nextInt();
		System.out.println("Factorial (" + n + ") = " + factorialRec (n));

	}
	
	//Creating a method to calculate factorial using recursive method:
	public static long factorialRec (int n) {
		if (n== 0)
			return 1;
		else
			return n * factorialRec(n-1);
	}

}
