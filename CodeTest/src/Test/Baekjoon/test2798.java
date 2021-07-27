package Test.Baekjoon;

import java.util.Scanner;

public class test2798 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0 ; i<N ; i++) {
			
			arr[i] = sc.nextInt();
		}
		
		int result = search(arr,N,M);
		System.out.println(result);
	}
	
	// 탐색
	static int search(int[] arr, int N, int M) {
		int max = 0;
		int sum = 0;
		int result=0;
		
		// 3개를 고르기 때문에 첫번째 카드는 N-2까지만 순회
		for(int i=0 ; i<N-2 ; i++) {
			// 두 번째 카드는 첫번째 카드 다음부터 N-1까지만 순회
			for(int j=i+1 ; j<N-1 ; j++) {
				// 세 번째 카드는 두 번째 카드 다음부터 N까지 순회
				for(int x=j+1 ; x<N ; x++) {
					// 3개 카드의 합 변수 sum
					sum = arr[i]+arr[j]+arr[x];
					// 합이 현재 가장 큰 값보다 크고, 합이 M 값보다 작으면 합을 가장 큰 값에 대입
					if(sum>max && sum<=M) {
						max = sum;
					}
				}
			}
		}
		// 가장 큰 값과 합계 중 작은 값 출력
		result = Math.min(sum, max);
		return result;
	}
}
