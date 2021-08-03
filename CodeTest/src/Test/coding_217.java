package Test;

import java.util.*;

public class coding_217 {
	public static int[] d = new int[10000];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=2 ; i<=num ; i++) {
			// 현재 수에서 1을 빼는 경우
			d[i] = d[i-1] + 1;
			
			// 현재 수에서 5를 나누는 경우
			if(i%5==0)
				d[i] = Math.min(d[i], d[i/5]+1);
			
			// 현재 수에서 3를 나누는 경우
			if(i%3==0)
				d[i] = Math.min(d[i], d[i/3]+1);
			
			// 현재 수에서 2를 나누는 경우
			if(i%2==0)
				d[i] = Math.min(d[i], d[i/2]+1);
		}
		
		System.out.println(d[num]);
	}
}
