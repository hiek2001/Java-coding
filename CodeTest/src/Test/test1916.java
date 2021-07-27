package Test;

import java.util.*;

public class test1916 {
	
	// 피보나치 수열은 뒤로 갈수록 수가 엄청나게 커지기 때문에, long 8byte라는 큰 자료형 사용
	static long[] arr = new long[200];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		
		System.out.println(fibonacci(n)%10009);
	}
	public static long fibonacci(long n) {
		if(n<=2)
			return 1;
		else if(arr[(int) n] != 0)
			return arr[(int)n];
		else
			return arr[(int)n]=(fibonacci(n-1) + fibonacci(n-2))%10009;
	}
}



