package codeforces;

import java.util.*;

public class Main {
//	3 18
//	1 3 4
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		//testCase count start
		while(testCase-- > 0) {
			int n = sc.nextInt();
			int total = sc.nextInt();
			
			int a[] = new int[n];
			
			int mx = 0, totsum = 0;
			for(int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
				
				totsum += a[i];
				if(a[i] > mx) mx = a[i];
			}
			
			totsum = (mx*(mx+1))/2 - totsum;
			
			String ans = "NO";
			if(total < totsum) {
				ans = "NO";
			}else if(total == totsum) {
				ans = "YES";
			}else {
				for(int i = mx+1; totsum + i-1 <= total; i++) {
					if(totsum+i-1 == total) {
						ans = "YES";
						break;
					}
					if(totsum+i-1 > total) {
						ans = "NO";
						break;
					}
				}
			}
			
			System.out.println(ans);
		}
		
		//Scanner close after all testCases
		sc.close();
	}

}
