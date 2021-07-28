package Test.Baekjoon;

import java.io.*;
import java.util.*;

public class bj1181 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] arr = new String[n];
		for(int i=0 ; i<n ; i++) {
			arr[i] = br.readLine();
		}
		
		Arrays.sort(arr, new Comparator<String>() {
			public int compare(String s1, String s2) {
				// 단어 길이가 같은 경우
				if(s1.length() == s2.length()) {
					return s1.compareTo(s2);
				}
				else
					return s1.length() - s2.length(); // 양수로 반환되면 위치가 바뀌지 않음
			}
		});
		
		StringBuilder sb = new StringBuilder();
		sb.append(arr[0]).append("\n");
		for(int i=1 ; i<arr.length ; i++) {
			if(!arr[i].equals(arr[i-1]))
				sb.append(arr[i]).append("\n");
		}
		System.out.println(sb);
		
	}
}
