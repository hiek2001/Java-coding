package Test;

import java.util.Scanner;

public class test1901 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int n = sc.nextInt();
		
		factorial(n);
	}
	
	public static void factorial(int x) {
		if(x==0) 
			return;
		else {
			factorial(x-1);
			System.out.println(x);
		}		
	}
}
