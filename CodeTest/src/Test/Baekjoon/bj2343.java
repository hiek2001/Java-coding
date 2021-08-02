package Test.Baekjoon;

import java.util.*;
import java.io.*;

public class bj2343 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		
		int sum = 0;
		int start = 0;
		
		for(int i=0 ; i<arr.length ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			sum += arr[i];		
			start = Math.max(start, arr[i]);
		}

		int end = sum;
		
		while(start<=end) {
			int mid = (start+end)/2;
			int count = 0;
			sum = 0;
			for(int i=0 ; i<arr.length ; i++) {
				if(sum + arr[i] > mid) {
					sum = 0;
					count++;
				}
				sum += arr[i];
			}
			
			if(sum>0) 
				count++;
			
			if(count <= m)
				end = mid - 1;
			else
				start = mid + 1;
		}
		System.out.println(start);
		
	}
}
