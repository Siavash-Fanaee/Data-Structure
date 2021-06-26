package workbook08;

import java.util.Scanner;

//Using constructor to create scanner, get number from client, invoke calculator and print the result
public class FibonacciIterative {
	public FibonacciIterative() {
		int n = 0;
		Scanner scn = new Scanner(System.in);
		System.out.print("\nEnter an Integer to calculate its fibonacci using Iterative Mehthod: ");
		n = scn.nextInt();
		System.out.println("Factorial (" + n + ") = " + fibonacciIter(n));

	}

	//Creating a method to calculate Fibonacci using iterative method
	public static long fibonacciIter(int index) {
		long [] fib = new long [index + 2];
		fib [0] = 0; //First base case
		fib [1] = 1; //Second base case
		for (int i = 2; i <= index; i++) //Loop for calculating index 2 and greater
			fib [i] = fib[i-1] + fib [i-2];
		return fib [index];



	}
}
