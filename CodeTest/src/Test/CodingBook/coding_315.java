package Test.CodingBook;

import java.util.*;

public class coding_315 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0 ; i<arr.length ; i++) 
			arr[i] = sc.nextInt();
		
		
		int count = 0;
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=i+1 ; j<arr.length ; j++) {
				if(arr[i] != arr[j])
					count++;
			}
		}
		System.out.println(count);
	}
}
