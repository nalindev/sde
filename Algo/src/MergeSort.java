/*
 * Merge sort is a divide-and-conquer algorithm based on the idea of breaking down a list into several
 * sub-lists until each sublist consists of a single element and merging those sublists in a manner that
 * results into a sorted list.
 */

public class MergeSort {

	public static void main(String[] args) {
		int arr[] = { 11, 30, 24, 7, 31, 16, 39, 41 };
		int n = arr.length;
		
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}

}
