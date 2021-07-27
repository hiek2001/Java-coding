package Test.Baekjoon;

import java.util.*;

public class test5543 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] burger = new int[3];
		int[] drink = new int[2];
		for(int i=0; i<3; i++) {
			int price = sc.nextInt();
			burger[i] = price;
		}
		for(int i=0; i<2; i++) {
			int price = sc.nextInt();
			drink[i] = price;
		}
		int b_min = burger[0];
		for(int num:burger) {
			if(num < b_min) {
				b_min = num;
			}
		}
		int d_min = drink[0];
		for(int num:drink) {
			if(num < d_min) {
				d_min = num;
			}
		}
		System.out.print(b_min+d_min-50);
		
	}
}
