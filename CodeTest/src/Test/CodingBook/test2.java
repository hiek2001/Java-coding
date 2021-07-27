package Test.CodingBook;

import java.util.*;


public class test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i=0 ; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		
		Arrays.sort(arr);
		int first = arr[n-1]; // 가장 큰수
		int second = arr[n-2]; //두번째로 큰수
		
		//가장 큰 수가 더해지는 횟수 계산
		int cnt = (m/(k+1)) *k;
		
		
	}
}
