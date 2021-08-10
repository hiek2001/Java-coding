package Test.CodingBook;

import java.util.*;

public class coding_311 {
	public static int n;
	public static ArrayList<Integer> list = new ArrayList<>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		for(int i=0; i<n ; i++) 
			list.add(sc.nextInt());
		
		Collections.sort(list);
		
		int result = 0; // 총 그룹의 수
		int count = 0; // 현재 그룹에 포함된 모험가의 수
		
		for(int i=0 ; i<n ;i++) { //공포도 낮은 것부터 하나씩 확인하며
			count += 1; // 현재 그룹에서 해당 모험가를 포함시키기
			if(count >= list.get(i)) { // 현재 그룹에 포하모딘 모험가의 수가 현재 공포도 이상이라면, 그룹 결성
				result +=1; // 총 그룹의 수 증가시키기
				count = 0; // 현재 그룹의 포함된 모험가의 수 초기화
			}
		}
		System.out.println(result);
		
	}
}
