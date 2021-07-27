package Test.Baekjoon;

import java.util.Scanner;

public class test1547 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] cups = {0,1,0,0};
		
		for(int i=0 ; i<n ; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int test = cups[x];
			cups[x] = cups[y];
			cups[y] = test;
		}
		sc.close();
		
		for(int i=0 ; i<cups.length ; i++) {
			if(cups[i] == 1) {
				System.out.println(i);
			}
		}
		
	}
}
