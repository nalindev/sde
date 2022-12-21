import java.util.*;
public class Selection {
/*
 *  Selection sort 
 *        - Time Complexity -
 *                Avg - O(n)^2
 *                worst - O(n)^2
 *                best - O(n)^2
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			int mx = i;
			for(int j = i+1; j < n; j++) {
				if(arr[j] < arr[mx]) {
					mx = j;
				}
			}
			
			if(arr[mx] < arr[i]) {
				int temp = arr[mx];
				arr[mx] = arr[i];
				arr[i] = temp;
			}
		}
		
		for(int value : arr) {
			System.out.print(value + " ");
		}
		
		sc.close();
	}

}
