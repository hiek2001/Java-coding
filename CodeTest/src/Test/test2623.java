package Test;

import java.util.*;

public class test2623 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int num = 0;
		
		while(a!=0) {
			if(a<b) {
				num = a;
				a = b;
				b = num;
			}
			a = a-b;
		}
		System.out.println(b);
	}
}
