package Workbook03;

//importing Class to call its toString method in our toString method:
import java.util.Arrays;


public class LinearSearch {

    // private integer array:
	private int[] array = { 6, 12, 24, 38, 43, 59, 67, 75, 81, 92 };

    //Constructor:
	public LinearSearch() {

	}
	
    //Getter (necessary as the variable is private):
	public int[] getArray() {
		return array;
	}


    // Method toString will turn the array list to a String using Array.toString:
	public String toString(int[] array) {
		String str = Arrays.toString(array);
		return str;
	}

    //Method search will search the array by linear traversing of all elements of array:
	public int search(int[] array, int valueToBeFound) {
		int i = 0;
		while (i < array.length && array[i] != valueToBeFound) {
			i++;
		}
		if (i == array.length)
			return -1;
		else
			return i;
	}

    //Main method:	
	public static void main(String[] args) {

		int key;
        //Creating an object from the Class:
		LinearSearch lsrch = new LinearSearch();

        //Calling the methods of class:
		System.out.println("Array: " + lsrch.toString(lsrch.getArray()));


		
		key= 75;
		if (lsrch.search(lsrch.getArray(), key) > 0)
			System.out.println("The index of " + key + " in the array is " + lsrch.search(lsrch.getArray(), key));
		else
			System.out.println(key + " is not found in the array");
		
		key = 32;
		if (lsrch.search(lsrch.getArray(), key) > 0)
			System.out.println("The index of " + key + " in the array is " + lsrch.search(lsrch.getArray(), key));
		else
			System.out.println(key + " is not found in the array");
		
		key = 67;
		if (lsrch.search(lsrch.getArray(), key) > 0)
			System.out.println("The index of " + key + " in the array is " + lsrch.search(lsrch.getArray(), key));
		else
			System.out.println(key + " is not found in the array");
		

	}

}
