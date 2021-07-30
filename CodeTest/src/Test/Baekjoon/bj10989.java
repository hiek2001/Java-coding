package Test.Baekjoon;

import java.io.*;
import java.util.*;

public class bj10989 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		for(int i=0 ; i<n ; i++) {
			arr[i] =Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		
		StringBuilder sb = new StringBuilder();
		for(int num : arr)
			sb.append(num).append("\n");
		System.out.println(sb);
	}
}