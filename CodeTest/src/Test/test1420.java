package Test;

import java.util.*;

public class test1420 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        // 질문할 친구 명 수 입력
        int n = sc.nextInt();
        
        // 친구 저장할 수
        List<Friend> list = new ArrayList<>();
        
        // 입력받은 이름과 점수를 vo에 등록
        for(int i=0 ; i<n ; i++) {
            String fdName = sc.next();
            int fdScore = sc.nextInt();
            list.add(new Friend(fdName, fdScore));
        }
        
        Collections.sort(list);
        
        System.out.println(list.get(2).getName());
        
	}   
}



