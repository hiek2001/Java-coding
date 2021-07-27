package Test;
import java.util.*;
class BinarySearchTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("요솟수 : ");
		int num = sc.nextInt();
		int[] x = new int[num];
		
		System.out.println("오름차순으로 입력하세요");
		
		System.out.print("x[0] : ");
		x[0]=sc.nextInt();
		
		for(int i=1 ; i<num ; i++) {
			do {
				System.out.print("x["+i+"] : ");
				x[i]=sc.nextInt();
			} while (x[i] < x[i-1]);
		}
		
		System.out.print("검색할 값 : ");
		int ky=sc.nextInt();
		
		int idx=Arrays.binarySearch(x,ky);
		
		if(idx < 0) {
			int insPoint = -idx - 1;
			System.out.println("그 값의 요소가 없습니다.");
			System.out.printf("삽입 포인트는 %d입니다.\n", insPoint);
			System.out.printf("x[%d]의 바로 앞에 %d를 삽입하면 배열이 정렬 상태가 유지됩니다.",insPoint, ky);
		}
		else
			System.out.println(ky+"은 x["+idx+"]에 있습니다.");
	}
}
