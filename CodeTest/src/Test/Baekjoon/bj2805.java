package Test.Baekjoon;

import java.util.*;

public class bj2805 {
	public static long mid;
	public static long max;
	public static long sum;
	
	public static void main(String[] args) {
		// 1)
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		
		// 2)
		long max = 0;
		for(int i=0 ; i<arr.length ; i++) {
			arr[i] = sc.nextInt();
			max = Math.max(max, arr[i]);
		}
		
		long start = 0;
		long end = max;
		long result = 0;
		
		while(start<=end) {
			mid = (start+end)/2;
			sum = 0;
			for(int i=0 ; i<arr.length ; i++) 
				if(arr[i] > mid)
					sum += arr[i] - mid;
			
			if(sum<m)
				end = mid - 1;
			else {
				result = mid;
				start = mid + 1;
			}
		}
		System.out.println(result);
	}
	
}
