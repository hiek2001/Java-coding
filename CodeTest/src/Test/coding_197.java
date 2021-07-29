package Test;

import java.io.*;
import java.util.*;

public class coding_197 {
	// 재귀함수 이용해서 이진 탐색
	static int Search(int[] arr, int target, int start, int end) {
		if(start>end)
			return 0;
		int mid = (start+end)/2;
		if(arr[mid] == target)
			return mid;
		else if(arr[mid] > target)
			return Search(arr, target, start, mid-1);
		else
			return Search(arr, target, mid+1, end);
	}
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr1 = new int[n];
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		for(int i=0 ; i<arr1.length ; i++) {
			arr1[i] = Integer.parseInt(st1.nextToken());
		}
		
		int m = Integer.parseInt(br.readLine());
		int[] arr2 = new int[m];
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for(int i=0 ; i<arr2.length ; i++) 
			arr2[i] = Integer.parseInt(st2.nextToken());
		
		Arrays.sort(arr1);
		
		for(int num : arr2) {
			int result = Search(arr1, num, 0, n-1);
			
			if(result!=0)
				System.out.print("yes ");
			else
				System.out.print("no ");
		}
	}
}
