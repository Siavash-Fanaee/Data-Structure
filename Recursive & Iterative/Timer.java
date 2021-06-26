package workbook08;

/*
Using deduction and division for comparison durations proves that recursive methods 
are more time consuming and inefficient than iterative methods. The greater number,
the bigger duration timing difference. the reason is that in recursive method, function 
is invoked recursively and it will use much more Memory and CPU specially for greater 
cycles 
*/
public class Timer {

	public static void main(String[] args) {
		
		//Creating objects (the constructor will do everything):
		//Using System.nanoTime() to calculate start and end time of each process:
		
		//Factorial:
		long startTime1 = System.nanoTime();
		FactorialRecursive fr1 = new FactorialRecursive();
		long EndTime1 = System.nanoTime();
		long duration1 = EndTime1 - startTime1;
		System.out.println("Duration: " + duration1 + " nano seconds");

		long startTime2 = System.nanoTime();
		FactorialIterative fr2 = new FactorialIterative();
		long EndTime2 = System.nanoTime();
		long duration2 = EndTime2 - startTime2;
		System.out.println("Duration: " + duration2 + " nano seconds");
		
		//Using deduction and division to show the duration comparison:  
		System.out.println("\nRecursive Mehthod takes " + (duration1 - duration2) + " nanoseconds more than Iterative Mehthod.");
		System.out.println("\nRecursive Mehthod takes " + duration1 / duration2 + " times more than Iterative Mehthod.");
		System.out.println();	//Break to new line
		
		
		//Fibonacci:
		long startTime3 = System.nanoTime();
		FibonacciRecursive fb1 = new FibonacciRecursive();
		long EndTime3 = System.nanoTime();
		long duration3 = EndTime3 - startTime3;
		System.out.println("Duration: " + duration3 + " nano seconds");
		
		long startTime4 = System.nanoTime();
		FibonacciIterative fb2 = new FibonacciIterative();
		long EndTime4 = System.nanoTime();
		long duration4 = EndTime4 - startTime4;
		System.out.println("Duration: " + duration4 + " nano seconds");
		
		//Using deduction and division to show the duration comparison:  
		System.out.println("\nRecursive Mehthod takes " + (duration3 - duration4) + " nanoseconds more than Iterative Mehthod.");
		System.out.println("\nRecursive Mehthod takes " + duration3 / duration4 + " times more than Iterative Mehthod.");
		
		
		
	}

}
