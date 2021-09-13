package Test.Baekjoon;

import java.util.*;

public class bj1874 {
	public static int[] stack;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		stack = new int[n];
		int start = 0;
		int ptr = 0;
		
		while(n-- > 0) {
			int value = sc.nextInt();
			
			if(value > start) {
				for(int i=start+1 ; i<=value ; i++) {
					// push
					stack[ptr++] = i;
					sb.append("+").append("\n");
				}
				start = value;
			}
			
			else if(stack[ptr-1] != value) {
				System.out.println("NO");
				return;
			}
			
			int poll = stack[--ptr];
			sb.append("-").append("\n");
		}
		System.out.println(sb);
	}
}
