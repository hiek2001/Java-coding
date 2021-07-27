package Test;

import java.util.*;

public class test1915 {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int n = sc.nextInt();

		System.out.println(fibonacci(n));
	}
	
	public static int fibonacci(int n) {
	if(n<=2) 
			return 1;
	
		return fibonacci(n-1)+fibonacci(n-2);
	}
}
