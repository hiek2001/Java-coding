package Test;

import java.util.*;

public class test1904 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		factorial(a,b);
		
	}
	
	public static void factorial(int a, int b) {
		if(a<=b) {
			if(a%2!=0)
				System.out.print(a+" ");
		}
		else
			return;
		a++;
		factorial(a,b);
	}
}
