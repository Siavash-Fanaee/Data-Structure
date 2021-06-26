package workbook07;

public class MergeSort {
	public void sort(int[] list) {
		if (list.length < 2)
			return; // do not need to sort
		
		//Calculating mid index:
		int mid = list.length / 2;
		
		//Creating 2 temporary arrays [left to mid] and [mid+1 to right]:
		int left[] = new int[mid];
		int right[] = new int[list.length - mid];
		
		//Copy data from the main array (list) into left sub-arrays:
		for (int i = 0; i < mid; i++)
			left[i] = list[i];
		
		//Copy data from the main array (list) into right sub-arrays:
		for (int i = 0; i < list.length - mid; i++)
			right[i] = list[mid + i];
		
		//Sorting both sub-arrays:
		sort(left);
		sort(right);
		
		//Merging 2 sub-arrays invoking merge method:
		merge(left, right, list);
	}

	private static void merge(int[] firstHalf, int[] secondHalf, int[] sortedList) {
		
		//Initialize indices of temp sub-arrays and merged array (k):
		int i = 0, j = 0, k = 0;
		
		//Merging back (firstHalf and secondHalf into sortedList)
		while (i < firstHalf.length && j < secondHalf.length) { 
			if (firstHalf[i] < secondHalf[j]) {
				sortedList[k] = firstHalf[i];
				i++;
			} else {
				sortedList[k] = secondHalf[j];
				j++;
			}
			k++; //In both case sortedList needs to increment.
		}
		
        //Copy remaining elements of firstHalf[] (if exist):
		while (i < firstHalf.length) {
			sortedList[k++] = firstHalf[i++];
		}
		
        //Copy remaining elements of secondHalf[] (if exist):
		while (j < secondHalf.length) {
			sortedList[k++] = secondHalf[j++];
		}
	}

}
