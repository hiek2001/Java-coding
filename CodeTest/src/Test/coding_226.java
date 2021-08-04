package Test;

import java.util.*;

public class coding_226 {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0 ; i<n ; i++)
			arr[i] = sc.nextInt();
		
		// 0원은 0으로, 나머지 아직 못구한 값은 1001으로 초기화
		int[] d = new int[m+1];
		for(int i=1 ; i<=m ; i++)
			d[i]=10001;
		
		// 2중 반보문을 돌며 각 화혜로 구할 수 있는 최소 개수를 구한다
		for(int num : arr) {
			for(int i=num ; i<=m ; i++) {
				if(d[i-num] != 10001) {
					d[i] = Math.min(d[i], d[i-num]+1);
				}
			}
		}
		if(d[m] == 10001)
			System.out.println(-1);
		else
			System.out.println(d[m]);
	}
}
