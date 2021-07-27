package Test;

import java.util.Scanner;

public class test1018 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text;
		text = sc.next();
		for(int i = 0; i < text.length(); i++) {
			System.out.println("'"+text.charAt(i)+"'");
		}
	}
}
