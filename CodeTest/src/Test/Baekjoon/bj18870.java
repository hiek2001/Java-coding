package Test.Baekjoon;

import java.io.*;
import java.util.*;

public class bj18870 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int idx = 0;
		int[] arr = new int[n];
		while(st.hasMoreTokens()) {
			arr[idx] = Integer.parseInt(st.nextToken());
			idx++;
		}
		for(int num : arr) {
			System.out.println(num);
		}
	}
}
