package workbook07;

//Importing Arrays class from java.util:
import java.util.Arrays;

public class TestMergeSort {

	//Main class:
	public static void main(String[] args) {
		
		//Defining and initiating tow arrays:
		int [] list3 = {2,3,2,5,6,1,-2,3,14,12};
		int [] list4 = {8,3,4,5,22,-5,-2,7,1,18};
		
		//Creating an object from MergeSort class:
		MergeSort mg = new MergeSort();
		
		System.out.println("TEST-MERGE-SORT:\n");
		
		//Printing the array list1 before and after sorting using Arrays.toString(array):
		System.out.println("List 3 (Before sort):");
		System.out.println(Arrays.toString(list3));
		//Invoking sort:
		mg.sort(list3);
		System.out.println("\nList 3 (After sort):");
		System.out.println(Arrays.toString(list3));
		
		//Printing the array list1 before and after sorting using Arrays.toString(array):
		System.out.println("\nList 4 (Before sort):");
		System.out.println(Arrays.toString(list4));
		//Invoking sort:
		mg.sort(list4);
		System.out.println("\nList 4 (After sort):");
		System.out.println(Arrays.toString(list4));
	}

}
