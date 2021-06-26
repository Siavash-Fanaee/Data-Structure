package workbook08;

import java.util.Scanner;

public class FibonacciRecursive {

	//Using constructor to create scanner, get number from client, invoke calculator and print the result
	public FibonacciRecursive() {
		int n = 0;
		Scanner scn = new Scanner(System.in);
		System.out.print("\nEnter an Integer to calculate its fibonacci using Recursive Mehthod: ");
		n = scn.nextInt();
		System.out.println("Factorial (" + n + ") = " + fibonacciRec(n));

	}

	//Creating a method to calculate Fibonacci using Recursive method
	public static long fibonacciRec(int index) {
		if (index <= 1) //Base cases
			return index;
		else // Calculating fib using recursive method
			return fibonacciRec(index - 1) + fibonacciRec(index - 2);

	}

}
