package Test;
import java.util.*;

public class CodeUpArray2 {
	
	public static void main(String[] args) { //2차원 배열
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] array = new int[n][n];
		int i=0, j=0;
		int counter=1;
				
		for(i=0 ; i<n ; i++) {
			if(i % 2 == 0) { //짝수 줄의 값 순열 정렬
				for(j=0 ; j<n ; j++) {
					array[i][j]=counter;
					counter++;
				}
			}
			else { //홀수 줄의 값은 역순 정렬
				for(j=n-1 ; j>=0 ; j--) {
					array[i][j]=counter;
					counter++;
				}
			}		
		}
		for(i=0 ; i<n ; i++) {
			for(j=0 ; j<n ; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println(" ");
		}
	}
}
