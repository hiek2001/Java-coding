package Test;

import java.util.Scanner;

public class test1025 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String five;
		five = sc.next();
		//문자열을 char형 배열로 변환
		char[] charArr = five.toCharArray();
		for(int i = 0; i < charArr.length; i++) {
			System.out.print("["+charArr[i]);
			for(int j = charArr.length-1; j>i;j--) {
				System.out.print("0");
			}
		System.out.println("]");
		}
	}
}
