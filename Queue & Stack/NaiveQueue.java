package workbook02;

public class NaiveQueue {
//declare instant head and variables tail (hold indices) in the class level. All method have access to them (static).
	static final int head = 0;
	static int tail;

//main method and testing all other methods:
	public static void main(String[] args) {
//declare an array of 5 elements to test our Stack:		
		int array[] = new int[5];
//Some method callings for testing the methods:
		if (isEmpty(array))
			System.out.println("The queue is empty");

		enqueue(array, 1);
		enqueue(array, 2);
		enqueue(array, 3);
		enqueue(array, 4);
		enqueue(array, 5);
		enqueue(array, 6);

		if (isFull(array))
			System.out.println("The queue is Full");

		dequeue(array);
		dequeue(array);
		dequeue(array);
		dequeue(array);
		dequeue(array);
		dequeue(array);

		if (isEmpty(array))
			System.out.println("The queue is empty");

	}

//isEmpty method: to check if the queue is empty or have at least 1 element:
	public static boolean isEmpty(int[] array) {
//empty condition:
		if (tail == 0)
			return true;
		else
			return false;
	}

//isFull method: to check if the stack is full:
	public static boolean isFull(int[] array) {
//full condition:
		if (tail == array.length)
			return true;
		else
			return false;
	}

//enqueue method: to insert element x  if queue is not already full:
	public static void enqueue(int[] array, int x) {
		if (isFull(array))
			System.out.println("Overflow");
		else {
			array[tail] = x;
			tail++;
			for (int i = 0; i < array.length; i++)
				System.out.print(array[i] + "	");
			System.out.println("");
		}
	}

//dequeue method: to delete element from the head position of the queue and push other elements back:
	public static void dequeue(int[] array) {
		if (isEmpty(array)) {
			System.out.println("Underflow");
		} else {

			for (int i = 0; i < tail - 1; i++)
				array[i] = array[i + 1];
			tail--;
			array[tail] = 0;

			for (int i = 0; i < array.length; i++)
				System.out.print(array[i] + "	");
			System.out.println("");
		}

	}

}
