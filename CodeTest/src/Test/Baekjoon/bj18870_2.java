package Test.Baekjoon;

import java.io.*;
import java.util.*;

public class bj18870_2 {
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
		
		int[] arrClone = arr.clone();
		Arrays.sort(arrClone);
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		idx=0;
		for(int num : arrClone) {
			if(!map.containsKey(num)) {
				map.put(num, idx++);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int num : arr) {
			sb.append(map.get(num)).append(' ');
		}
		System.out.println(sb.toString());
	}
}
