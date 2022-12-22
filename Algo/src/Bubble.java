import java.util.*;

public class Bubble {
/*
 *  Bubble sort Algorithm
 *     Time Complexity - 
 *          avg - O(n)^2
 *          worst - O(n)^2
 *          best - O(n)
 *     Space Complexity - O(1)
 */
	
	static void bubble(int n, int arr[]) {
		/*
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n - i - 1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		In the above algo the comparision will be made on each iteration even if the array is sorted.
		
		To make it more optimized i can declare one bool value
		*/
		
		for(int i = 0; i < n; i++) {
			boolean checkSorted = true;
			for(int j = 0; j < n - i - 1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					checkSorted = false;
				}
			}
			if(checkSorted) break;
		}
		
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		bubble(n, arr);
		
		sc.close();
	}

}
