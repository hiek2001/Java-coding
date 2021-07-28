package Test.Baekjoon;

import java.io.*;

public class bj2750 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		int[] arr = new int[size];
 		for(int i=0 ; i<arr.length ; i++) {
 			arr[i] = Integer.parseInt(br.readLine());
 		}
 		// 삽입정렬
 		for(int i=1 ; i<arr.length ; i++) {
 			for(int j=i ; j>0 ; j--) {
 				if(arr[j-1] > arr[j]) {
 					int temp = arr[j];
 					arr[j] = arr[j-1];
 					arr[j-1] = temp;
 				}
 				else
 					break;
 			}
 		}
 		for(int num : arr) {
 			System.out.println(num);
 		}
	}
}
