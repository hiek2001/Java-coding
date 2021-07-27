package Test;

import java.util.*;
public class CodeUpArray3 {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int[][] array = new int[n][n];
			int i,j;
			int counter=1;
			
			for(j=0 ; j<n ; j++) {
				for(i=0 ; i<n ; i++) {
					array[i][j]=counter;
					counter++;
				}
				if(j<=n-1) {
					array[i][j]=counter;
					counter++;
				}
			}
			
			
			//배열 출력
			for(i=0 ; i<n ; i++) {
				for(j=0 ; j<n ; j++) {
					System.out.print(array[i][j]+" ");
				}
				System.out.println("");
			}
		}
}
