package Test.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj1964 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		int num = 5;
		int x = 7;
		for(int i=1 ; i<size ; i++) {
			num = (num+7) % 45678;
			x = (x+3)%45678;
		}
		System.out.println(num);
	}
}
