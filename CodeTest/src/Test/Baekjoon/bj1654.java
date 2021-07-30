package Test.Baekjoon;

import java.util.*;

public class bj1654 {
	public static long max;
	
	public static void main(String[] args) {
		// 1)
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();
		int[] arr = new int[k];
		
		// 2)
		max = 0;
		for(int i=0 ; i<arr.length ; i++) {
			arr[i] = sc.nextInt();
			max = Math.max(max, arr[i]);
		}
		
		// 3,4)
		long start = 1;
		long end = max;
		long mid = 0;
		
		long result = 0;
			
		while(start <= end) {
			mid = (start+end)/2;
			long sum = 0;
			for(int i=0; i<arr.length ; i++) {
				sum += arr[i]/mid;
			}
			
			if(sum < n) end = mid-1;
			else {
				result = mid;
				start = mid+1;
			}		
		}
		// 5)
		System.out.println(result);
	}
}
