package Test.Baekjoon;

import java.io.*;
import java.util.*;

public class bj10814 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[][] member= new String[n][2]; 
		
		for(int i=0 ; i<n ;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			member[i][0] = st.nextToken();
			member[i][1] = st.nextToken();
		}
		
		Arrays.sort(member, new Comparator<String[]>() {
			@Override
			public int compare(String[] c1, String[] c2) {
				return Integer.compare(Integer.parseInt(c1[0]), Integer.parseInt(c2[0]));
			}
		});
		
		for(int i=0 ; i<n ; i++) {
			System.out.println(member[i][0]+" "+member[i][1]);
			
		}
		
	}
}
