package Test;

public class forCheck {

	public static void main(String[] args ) {
		int[] y = {10,80,40,50,90};
		int[] x = {1,1,1,1,1};
		
		for(int i=0 ; i<5 ; i++) {
			for(int j=0 ; j<5 ; j++) {
				if(y[i]<y[j]) {
					System.out.println(i+"번째 ::: "+y[i]+"  <  "+j+"번째의 ::: "+y[j]);
					x[i]++;
					System.out.println(x[i]);
				}
			}
		}
		for(int i=0 ; i<5 ; ++i) {
			int j = y[i]++;
			System.out.println(i+"번째::  "+j);
		}
		
		for(int i=0 ; i<5 ; i++) {
			System.out.printf("%d", x[i]);
		}
	}
}
