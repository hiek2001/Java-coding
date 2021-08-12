package Test.CodingBook;

import java.util.*;

public class coding_321 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		int len = num.length();
		int[] list = new int[len];
		for(int i=0 ; i<len ; i++)
			list[i] = num.charAt(i) - '0';
		
		int mid = len/2;
		int fsum = 0;
		int bsum = 0;
		for(int i=0 ; i<len ; i++) {
			if(i < mid) 
				fsum += list[i];	
			else 
				bsum += list[i];		
		}
		
		if(fsum == bsum)
			System.out.println("LUCKY");
		else
			System.out.println("READY");
	}
}
