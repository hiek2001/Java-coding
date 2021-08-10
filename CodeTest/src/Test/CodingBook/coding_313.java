package Test.CodingBook;

import java.io.*;

public class coding_313 {	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split("");
		
		int count0 = 0;
		int count1 = 0;
		
		if(arr[0].equals("0"))
			count0++;
		else
			count1++;
		
		for(int i=1 ; i<arr.length ; i++) {
			if(!arr[i-1].equals(arr[i])) {
				if(arr[i-1].equals("0")) {
					count0++;
				}	
				else {
					count1++;
				}
					
			}
		}
		 
		System.out.println(Math.min(count0, count1));
	}
}
