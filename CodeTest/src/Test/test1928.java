package Test;

import java.util.*;

public class test1928 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(n);
		f(n);
	}
	
	public static int f(int n) {
		if(n>1) {
			if(n%2!=0) {
				n=3*n+1;
			}
			else {
				n=n/2;
			}
			System.out.println(n);
			f(n);
		}
		return 0;

	}
	
}
