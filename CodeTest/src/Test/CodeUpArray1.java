package Test;
import java.util.*;

public class CodeUpArray1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	//	System.out.println("1) 정수를 입력하세요 : ");
		int n = sc.nextInt(); //정수 갯수 입력 받기
		int[] arr = new int[n];


		for(int i=0 ; i<n ; i++) {
			//n 갯수대로 정수 입력 받기
		//	System.out.print(n+"개 만큼 정수 입력받겠습니다. 입력하세요 >>"+(i+1)+"번째 작성중");
			arr[i]=sc.nextInt();
		}
	//	System.out.println("counter :"+ n);
		
		for(int i=n-1; i>=0 ; i--) {
			System.out.print(arr[i]+" ");
		}
	}
}
