package Test.CodingBook;

import java.util.*;

public class coding_97 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		int min = 0;
		int result = 0;
		for(int i=0 ; i<n ; i++) 
			for(int j=0 ; j<m ; j++) 
				arr[i][j] = sc.nextInt();
			
		
		for(int i=0 ; i<n ; i++) {
			for(int j=1 ; j<m ; j++) {
				min = Math.min(arr[i][j-1], arr[i][j]);
			}
			result = Math.max(min, result);
		}
		System.out.println(result);
	}
} 
