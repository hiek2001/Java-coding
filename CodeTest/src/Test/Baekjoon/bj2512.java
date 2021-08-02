package Test.Baekjoon;

import java.io.*;
import java.util.*;

public class bj2512 {	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for(int i=0 ; i<arr.length ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		// 총 예산
		int target = Integer.parseInt(br.readLine());
		
		// 최대값 구하기
		int max = 0;
		for(int i=0 ; i<arr.length ; i++)
			max = Math.max(max, arr[i]);
		
		long start = 1;
		long end = max;
		long mid = 0;
		long result = 0;
		
		// 이진 탐색 알고리즘 호출
		while(start<=end) {
			mid = (start+end)/2;
			
			long sum = 0;
			for(int i=0 ; i<arr.length ; i++) {
				if(arr[i] >= mid)
					sum += mid;
				else
					sum += arr[i];
			}
			
			if(sum > target)
				end = mid - 1;
			else {
				start = mid + 1;
				result = Math.max(result, mid);
			}
		}
		
		System.out.println(result);
		
	}
}
