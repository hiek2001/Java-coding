package Test.Baekjoon;

import java.util.*;

public class bj2438 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1 ; i<=n ; i++) {
			for(int j=1 ; j<i+1 ; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}
