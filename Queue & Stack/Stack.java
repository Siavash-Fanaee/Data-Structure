package workbook02;

public class Stack {
//declare a variable named top in the class level for index of array. All method have access to this variable (static).
	static int top;

//main method and testing all other methods:
	public static void main(String[] args) {
//declare an array of 5 elements to test our Stack:
		int array[] = new int[5];

//Some method callings for testing the methods:
		System.out.println(isEmpty(array));

		push(array, 5);
		push(array, 10);
		push(array, 15);
		push(array, 20);
		push(array, 25);
		push(array, 30);

		System.out.println(isFull(array));


		pop(array);
		pop(array);
		pop(array);
		pop(array);
		pop(array);
		pop(array);

		top(array);

		push(array, 250);
		push(array, 500);
		push(array, 750);

		top(array);

		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + "	");

	}

	/*
	 * top method vs pop method: top method only print the current situation and
	 * neither change any variable nor do any calculation while pop method makes
	 * previous top element 0 and decrement the top index
	 */

//top method: to show the top index and its value:
	public static void top(int[] array) {
		if (isEmpty(array))
			System.out.println("Underflow: stack is empty (for top method)");
		else {
			System.out.println("top value is " + array[top - 1] + " and top index is " + (top - 1));
		}

	}

//isEmpty method: to check if the stack is empty or have at least 1 element:
	public static boolean isEmpty(int[] array) {
		if (top == 0)
			return true;
		else
			return false;
	}

//isFull method: to check if the stack is full:
	public static boolean isFull(int[] array) {
		if (top == array.length)
			return true;
		else
			return false;
	}

//pop method: to pop (delete) the last element of Stack (LIFO) if Stack is not already empty:
	public static void pop(int[] array) {
		if (!isEmpty(array)) {
			array[top - 1] = 0;
			top = top - 1;
			
			for (int i = 0; i < array.length; i++)
				System.out.print(array[i] + "	");
			System.out.println("");
		} 
		else
			System.out.println("Underflow: stack is empty (for pop method)");
	}

//push method: to push (insert) element to the Stack if Stack is not already full:
	public static void push(int[] array, int x) {
		if (!isFull(array)) {
			array[top] = x;
			top = top + 1;
			
			for (int i = 0; i < array.length; i++)
				System.out.print(array[i] + "	");
			System.out.println("");
			
		}
		else
			System.out.println("Error: Overflow (you can not push more)");

	}

}
