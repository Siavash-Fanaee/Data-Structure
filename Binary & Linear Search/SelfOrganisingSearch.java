package Workbook03;

//importing Class to call its toString method in our toString method:
import java.util.Arrays;

public class SelfOrganisingSearch {

    //private integer array:
	private int[] array = { 6, 12, 24, 38, 43, 59, 67, 75, 81, 92 };

    //Constructor:
	public SelfOrganisingSearch() {

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
		int temp;
		while (i < array.length && array[i] != valueToBeFound) {
			i++;
		}
        //-1 shows that the key is not found in the array:
		if (i == array.length)
			return -1;
		else
            //keep the value of index i in temp; move elements index 0 to i-1, one cell to right side and put temp into index 0;
			temp = array [i];
			for (int j = i-1; j >= 0 ; j--) {
				array [j+1] = array [j];
			}
			array [0] = temp;
			return i;
	}

    //Main method:	
	public static void main(String[] args) {
		int key;

        //Creating an object from the Class:
		SelfOrganisingSearch sOsrch = new SelfOrganisingSearch();

        //Calling the methods of class:
		System.out.println("Array: " + sOsrch.toString(sOsrch.getArray()) +"\n");		


		key = 59;
		System.out.println("The index of " + key + " in the array is " + sOsrch.search(sOsrch.getArray(), key));
		System.out.println("Array: " + sOsrch.toString(sOsrch.getArray()) +"\n");		
		
		key = 92;
		System.out.println("The index of " + key + " in the array is " + sOsrch.search(sOsrch.getArray(), key));
		System.out.println("Array: " + sOsrch.toString(sOsrch.getArray()) +"\n");		
		
		key = 35;
		System.out.println("The index of " + key + " in the array is " + sOsrch.search(sOsrch.getArray(), key));
		System.out.println("Array: " + sOsrch.toString(sOsrch.getArray()) +"\n");		
		
	}

}
