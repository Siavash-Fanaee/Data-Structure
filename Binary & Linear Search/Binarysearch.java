package Workbook03;

//importing Class to call its toString method in our toString method:
import java.util.Arrays;


public class Binarysearch {

    //private integer array (already sorted in ascending order);
	private int[] array = { 6, 12, 24, 38, 43, 59, 67, 75, 81, 92 };

    //Constructor:
	public Binarysearch () {

	}
	
    //Getter (necessary as the variable is private):
	public int[] getArray() {
		return array;
	}


    //Method toString will turn the array list to a String using Array.toString:
	public String toString(int[] array) {
		String str = Arrays.toString(array);
		return str;
	}

    //Method search get an array and a key as input and will search the array using binary algorithm:
	public int search(int[] array, int key) {
		int start = 0;
		int end = array.length-1;

		while (end >= start) {
			int mid = (start + end) / 2;
			if (key < array [mid])
				end = mid - 1;
			else if (key == array [mid])
				return mid;
			else 
				start = mid + 1;
		}
		return -1-start;
		

	}

    //Main method:	
	public static void main(String[] args) {
		int key;

        //Creating an object from the Class:
		LinearSearch bsrch = new LinearSearch();

        //Calling the methods of class:
		System.out.println("Array: " + bsrch.toString(bsrch.getArray())+ "\n");

		
		key= 75;
		if (bsrch.search(bsrch.getArray(), key) > 0)
			System.out.println("The index of " + key + " in the array is " + bsrch.search(bsrch.getArray(), key) + "\n");
		else
			System.out.println(key + " is not found in the array\n");
		
		key = 32;
		if (bsrch.search(bsrch.getArray(), key) > 0)
			System.out.println("The index of " + key + " in the array is " + bsrch.search(bsrch.getArray(), key) + "\n");
		else
			System.out.println(key + " is not found in the array\n");
		
		key = 67;
		if (bsrch.search(bsrch.getArray(), key) > 0)
			System.out.println("The index of " + key + " in the array is " + bsrch.search(bsrch.getArray(), key) + "\n");
		else
			System.out.println(key + " is not found in the array\n");
		
		key = 38;
		if (bsrch.search(bsrch.getArray(), key) > 0)
			System.out.println("The index of " + key + " in the array is " + bsrch.search(bsrch.getArray(), key) + "\n");
		else
			System.out.println(key + " is not found in the array\n");
		
		key = 95;
		if (bsrch.search(bsrch.getArray(), key) > 0)
			System.out.println("The index of " + key + " in the array is " + bsrch.search(bsrch.getArray(), key) + "\n");
		else
			System.out.println(key + " is not found in the array\n");
		
		key = 43;
		if (bsrch.search(bsrch.getArray(), key) > 0)
			System.out.println("The index of " + key + " in the array is " + bsrch.search(bsrch.getArray(), key) + "\n");
		else
			System.out.println(key + " is not found in the array\n");
		
		System.out.println("Array: " + bsrch.toString(bsrch.getArray())+ "\n");

				

	}

}



