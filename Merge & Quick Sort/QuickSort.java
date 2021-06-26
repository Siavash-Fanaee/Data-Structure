package workbook07;

public class QuickSort {
	
	//Overloading the quickSort method for the special case (0 and list.length - 1). This method will be invoked in Test class:
	public void quickSort(int[] list) {
		quickSort(list, 0, list.length - 1);
	}

	private void quickSort(int[] list, int first, int last) {
		if (last > first) {
			int pivotIndex = partition(list, first, last);
			//Recursive quick sort for partitions (Cycle):
			quickSort(list, first, pivotIndex - 1);
			quickSort(list, pivotIndex + 1, last);
		}
	}

	/** Partition the array list[first..last] */
	private int partition(int[] list, int first, int last) {
		int pivot = list[first]; 	//Considering the first element as the pivot.
		int low = first + 1; 		//Index for left-to-right search
		int high = last; 			//Index for right-to-left search

		//Using nested while to traverse forward and backward in the list as far as high index > low index:
		while (high > low) {
			//Search left to right
			while (low <= high && list[low] <= pivot)
				low++;

			//Search right to left
			while (low <= high && list[high] > pivot)
				high--;

			//Swap elements when above conditions are met and index high is still greater than index low:
			if (high > low) {
				int temp = list[high];
				list[high] = list[low];
				list[low] = temp;
			}
		}

		//Moving high index back while high element is not less than pivot (after this while they will be swapped):
		while (high > first && list[high] >= pivot)
			high--;

		//Swap pivot and the element of index high in the list when above previous is met:
		if (pivot > list[high]) {
			list[first] = list[high];
			list[high] = pivot;
			return high;
		} 
		
		else 
			return first;

	}

}
