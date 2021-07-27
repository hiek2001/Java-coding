package Test;
import java.util.*;
class SeqSearchSen {
//요솟수가 n인 배열 a에서 key와 같은 요소를 보초법으로 선형 검색함
//	static int seqSearchSen(int[] a, int n,int key) {
//	int i=0;
//	
//	a[n]=key; //보초 추가
//	
//	while(true) {
//		if(a[i]==key)
//			break;
//		i++;
//	}
//	return i == n ? -1 : i;
//
//}
	
	static int seqSearchSen(int[] a, int n, int key) {
		a[n]=key;
		int i;
		for(i=0 ; i<n ; i++) {
			if(i==n)
				return -1;
		}
		 return i;
	}
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = sc.nextInt();
		int[] x=new int[num+1]; // 요솟수 num+1 (보초값을 넣어야 해서 +1 하는 것)
		
		for(int i=0 ; i<num ; i++) {
			System.out.print("x["+i+"] : ");
			x[i]=sc.nextInt();
		}
		
		System.out.print("검색할 값 : ");
		int ky = sc.nextInt();
		int idx=seqSearchSen(x,num,ky);
		
		if(idx==-1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.print(ky+"은(는) x["+idx+"]에 있습니다.");
	}
	
}
