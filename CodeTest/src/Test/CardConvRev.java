package Test;

import java.util.Scanner;

class CardConvRev {
	//정숫값 x를 r진수로 변화하여 배열d에 아랫자리부터 넣어두고 자릿수를 반환함.
	static int cardConvR(int x, int r, char[] d) {
		int digits = 0;			//변환 후의 자릿수
		String dchar ="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			d[digits++]=dchar.charAt(x % r); //r로 나눈 나머지를 저장
			x /= r;
		} while (x != 0);  //while의 조건문이 만족할때까지 실행됨
		return digits;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no; //변환하는 정수
		int cd; //기수
		int dno; //변환 후 자릿수
		int retry;
		char[] cno=new char[32];
		
		System.out.println("10진수를 기수 변환함");
		do {
			do {
				System.out.print("변환하는 음이 아닌 정수 :");
				no = sc.nextInt();
			} while (no < 0);
			do {
				System.out.print("어떤 진수로 변환할까요?");
				cd = sc.nextInt();
			} while (cd < 2 || cd > 36);
			dno = cardConvR(no, cd, cno); //no를 cd 진수로 변환
			
			System.out.print(cd+"진수로는 ");
			for(int i =dno-1;i>=0;i--)
				System.out.print(cno[i]);
			System.out.println("입니다.");
			
			System.out.println("한번더할까여? (1.예/0.아니요) :");
			retry=sc.nextInt();
		}while (retry==1);
	}
}
