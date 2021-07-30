package Test;

import java.io.*;
import java.util.*;

public class BinarySearch {
	// 재귀함수 사용
	static int Search2(int[] arr, int target, int start, int end) {
		if(start > end)
			return 0;
		int mid = (start+end)/2;
		
		if(arr[mid] == target)
			return mid;
		else if(arr[mid] > target)
			return Search2(arr, target, start, mid-1);
		else
			return Search2(arr, target, mid+1, end);
				
	}
	
	// 반복문 사용
	static int Search(int[] arr, int target, int start, int end) {
		while(start <= end) {
			int mid = (start+end)/2;
			
			if(arr[mid] == target) {
				return mid;
			}
			else if(arr[mid] > target) {
				return end = mid-1;
			}	
			else {
				return start = mid+1;
			}	
		}
		return 0;
		
	}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int target = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0 ; i<arr.length ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		//int result = Search(arr, target, 0, n-1);
		int result2 = Search2(arr, target, 0, n-1);
		if(result2==0)
			System.out.println("원소가 존재하지 않습니다.");
		else
			System.out.println(result2+1);
	}
}
