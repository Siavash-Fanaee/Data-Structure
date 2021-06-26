package workbook07;

//Importing Arrays class from java.util:
import java.util.Arrays;

public class TestQuickSort {

	//Main class:
	public static void main(String[] args) {
		
		//Defining and initiating tow arrays:
		int [] list1 = {2,3,2,5,6,1,-2,3,14,12};
		int [] list2 = {8,3,4,5,22,-5,-2,7,1,18};
		
		//Creating an object from QuickSort class:
		QuickSort qs = new QuickSort();
		
		System.out.println("TEST-QUICK-SORT:\n");
		
		//Printing the array list1 before and after sorting using Arrays.toString(array):
		System.out.println("List 1 (Before sort):");
		System.out.println(Arrays.toString(list1));
		//Invoking quickSort:
		qs.quickSort(list1);
		System.out.println("\nList 1 (After sort):");
		System.out.println(Arrays.toString(list1));
				
		//Printing the array list1 before and after sorting using Arrays.toString(array):
		System.out.println("\nList 2 (Before sort):");
		System.out.println(Arrays.toString(list2));
		//Invoking quickSort:
		qs.quickSort(list2);
		System.out.println("\nList 2 (After sort):");
		System.out.println(Arrays.toString(list2));
		
	}

}
