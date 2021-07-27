package Test;
import java.util.*;
class SeqSearchFor {

	static int seqSearch(int[] a, int n, int key) {
		for(int i=0 ; i<n ; i++)
			if(a[i]==key)
				return i; //검색 성공(인덱스 반환)
		return -1; //검색 실패
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = sc.nextInt();
		int[] x=new int[num];
		
		for(int i=0 ; i<num ; i++) {
			System.out.print("x["+i+"] : ");
			x[i]=sc.nextInt();
		}
		
		System.out.print("검색할 값 : ");
		int ky = sc.nextInt();
		
		int idx=seqSearch(x, num, ky);
		
		if(idx==-1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(ky+"은(는) x["+idx+"]에 있습니다.");
	}
}
