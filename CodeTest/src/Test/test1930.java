package Test;

import java.util.*;

public class test1930 {

	static int[][] memo = new int[14][14];
	
	public static int main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();
		
		//EOF
		while(sc.hasNext()) {
			System.out.println(SuperSum(k,n));
		}
		return 0;
	}
	
	public static int SuperSum(int k, int n) {
		int total = 0;
		if(k==0) {
			return n;
		}
		for(int i=0 ; i<n ; i++) {
			total +=SuperSum(k-1,i);
		}
		return total;
	}
}
