package Test.Baekjoon;

import java.io.*;
import java.util.*;

public class bj11650 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][2];
		
		for(int i=0 ; i<n ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] c1, int[] c2) {
				if(c1[0] == c2[0])
					return c1[1] - c2[1];
				return c1[0] - c2[0];
			}
		});
		
		for(int i=0 ; i<arr.length; i++) {
			System.out.println(arr[i][0]+" "+arr[i][1]);
		}
		
	}
}
