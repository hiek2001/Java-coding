package Test.CodingBook;

import java.util.*;

public class coding_312 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		int len = n.length();
		int[] arr = new int[len];
		for(int i=0 ; i<len ; i++) {
			arr[i] = n.charAt(i) - '0';
		}
		
		int result = 0;
		
		for(int i=0 ; i < len-1 ; i++) {
			if(i == 0) {
				if(arr[i] == 0) {
					result = arr[i] + arr[i+1];
				}	
				else {
					result = arr[i] * arr[i+1];

				}		
			}
			else {
				if(arr[i] == 0) {
					result += arr[i+1];
				}	
				else {
					result *= arr[i+1];
				}
					
			}		
		}
		System.out.println(result);
	}
}
