package workbook02;

public class CircularQueue {
//declare variables head and tail (hold indices) in the class level. All method have access to them (static).
	static int head;
	static int tail;

//main method and testing all other methods:
	public static void main(String[] args) {
//declare an array of 5 elements to test our Stack:				
		int array[] = new int[5];
//Some method callings for testing the methods:	
		if (isEmpty())
			System.out.println("The queue is empty");

		enqueue(array, 1);
		enqueue(array, 2);
		enqueue(array, 3);
		enqueue(array, 4);
		System.out.println("tail is " + tail);
		System.out.println("head is " + head);
		dequeue(array);
		enqueue(array, 5);
		dequeue(array);
		dequeue(array);
		enqueue(array, 6);
		System.out.println("tail is " + tail);
		System.out.println("head is " + head);
		enqueue(array, 7);
		System.out.println("tail is " + tail);
		System.out.println("head is " + head);

		if (isFull(array))
			System.out.println("The queue is Full");

	}
//isEmpty method: to check if the queue is empty:
	public static boolean isEmpty() {
//empty condition:
		if (head == tail)
			return true;
		else
			return false;
	}
//isFull method: to check if the stack is full:
	public static boolean isFull(int[] array) {
//empty condition:
		if (head == (tail + 1) || (head == 0 && tail == array.length - 1))
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
			if (tail == array.length - 1)
				tail = 0;
			else
				tail++;

			for (int i = 0; i < array.length; i++)
				System.out.print(array[i] + "	");
			System.out.println("");
		}
	}
//dequeue method: to delete element from the head position of the queue and push other elements back:
	public static void dequeue(int[] array) {
		if (isEmpty()) {
			System.out.println("Underflow");
		} else {
			array[head] = 0;
			head++;

			for (int i = 0; i < array.length; i++)
				System.out.print(array[i] + "	");
			System.out.println("");

		}
	}

}
