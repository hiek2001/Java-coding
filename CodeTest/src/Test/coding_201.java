package Test;

import java.io.*;
import java.util.*;

public class coding_201 {
	// 1)
	static int Search(int[] arr, int target, int start, int end) {
		if(start>end)
			return 0;
		int mid=(start+end)/2;		
		int sum = 0;
	
		for(int i=0 ; i<arr.length ; i++) {
			if(arr[i]>mid)
				sum += arr[i] - mid;
		}
			
		if(sum < target)
			return Search(arr, target, start, mid-1);
		else if(sum > target)
			return Search(arr, target, mid+1, end);
		else
			return mid;
			
		
		
		
	}
	public static void main(String[] args) {
		// 2)
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		int max = 19;
		for(int i=0 ; i<n ; i++) {
			arr[i] = sc.nextInt();
		}
		
		// 이진 탐색 알고리즘 호출
		int result = Search(arr, m, 0, max);
		
		// 3)
		System.out.println(result);
	}
}
