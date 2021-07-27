package Test;
import java.util.*;
class SearchIndexEx {

	static int SearchIndex(int[] a, int n, int key, int[] idx) {
		int i,j;
		int counter=0;
		for(i=0 ; i<n ; i++) {
			if(a[i]==key) {
				idx[i]=i;
				counter++;
			}
			
		}
		return counter;
	}
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n = 8;
		int[] a= {1,9,2,9,4,6,7,9};
		System.out.println("찾을 값을 입력하세요 : ");
		int key = sc.nextInt(); // 9
		int[] idx = new int[n];
		
		int counter = SearchIndex(a, n, key, idx);
		
		System.out.println("배열 idx에 저장된 값의 수는 "+counter+"입니다.");
	
	}
}
