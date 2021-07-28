package Test.Baekjoon;

import java.io.*;
public class bj1427 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String num = br.readLine();
		int[] arr = new int[num.length()];
		for(int i=0 ; i<arr.length ; i++) {
			arr[i] = num.charAt(i) - '0';
		}
		
		for(int i=1 ; i<arr.length ; i++) {
			for(int j=i ; j>0 ; j--) {
				if(arr[j-1] < arr[j]) {
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
				else break;
			}
		}
		for(int n : arr)
			System.out.print(n);
	}
}
