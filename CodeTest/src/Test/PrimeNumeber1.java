package Test;

class PrimeNumeber1 {
	//20이하의 소수를 열거
	public static void main(String[] args) {
		int counter = 0;  //나눗셈 횟수
		
		for (int n=2; n<=9; n++) {
			int i;
			for (i=2; i<n ; i++) {
				counter++;
				if(n % i == 0) //자기 자신만 나누어떨어짐, 이외에 나누어떨어지면 소수가 아님
					break;		// 안쪽 for문이 멈춤
			}
			if (n == i) //마지막까지 나누어떨어지지 않음
				System.out.println(n); //이 값이 소수인 것
		}
		System.out.println("나눗셈을 수행한 횟수 : "+counter);
	}
} //n이 소수인 경우 : n과 같은 값 > for문이 끝까지 실행됨
//n이 합성수인 경우 : n과 작은 값 > for문이 중단됨
