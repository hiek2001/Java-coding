package Test.CodingBook;

import java.util.*;

public class coding_322 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1)
		String word = sc.next();
		int len = word.length();
		ArrayList<Character> list = new ArrayList<>();
		int sum = 0;
		int num = 0;
		
		// 2)
		char check;
		for(int i=0 ; i<len ; i++) {
			check = word.charAt(i);
			if(!(check>='0' && check<='9')) 
				list.add(check);	
			else {
				// char를 int로 변환
				num = check -'0';
				sum += num;
			}
		}	
	
		// 3)
		Collections.sort(list);
		
		// 4) 출력
		for(char result : list)
			System.out.print(result);
		System.out.print(sum);
		
	}
}
