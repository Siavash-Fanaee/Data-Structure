package workbook08;

import java.util.Scanner;

public class FactorialIterative {
	
	//Using constructor to create scanner, get number from client, invoke calculator and print the result
	public FactorialIterative () {
		int n = 0;
		Scanner scn = new Scanner(System.in);
		System.out.print("\nEnter an Integer to calculate its factorial using Iterative Mehthod: ");
		n = scn.nextInt();
		System.out.println("Factorial (" + n + ") = " + factorialIter (n));
	}
	
	//Creating a method to calculate factorial using iterative method:
	public static long factorialIter (int n) {
		long factorial = 1;
		for (int i=1; i<=n; i++)
			factorial = factorial*i;
		return factorial;
	}

}
