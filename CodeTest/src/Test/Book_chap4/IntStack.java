package Test.Book_chap4;

import Test.Book_chap4.IntStack.EmptyIntStackException;
import Test.Book_chap4.IntStack.OverflowIntStackException;
import java.util.*;
public class IntStack {
	private int max;			// 스택 용량
	private int ptr;			// 스택 포인터
	private int[] stk;			// 스택 본체

	// 실행 시 예외 : 스택이 비어 있음
	public class EmptyIntStackException extends RuntimeException {  // RuntimeException은 예외를 느슨하게 정보만 제공 받는 것
		public EmptyIntStackException() { }
	}

	// 실행 시 예외 : 스택이 가득 참
	public class OverflowIntStackException extends RuntimeException {
		public OverflowIntStackException() { }
	}

	// 생성자
	public IntStack(int capacity) {
		ptr = 0;
		max = capacity;                      // 스택이 가득 참
		try {
			stk = new int[max];				// 스택 본체용 배열을  생성
		} catch (OutOfMemoryError e) {		// 생성할 수 없음 > 다른 메소드가 존재하지 않은 배열에 잘못 접근하는 것을 막을 수 있음, oufofmemeryerror는 java에서 지원하는 것
			max = 0;
		}
	}

	// 스택에 x를 푸시
	public int push(int x) throws OverflowIntStackException {
		if (ptr >= max)									// 스택이 가득 참, 여기서 ptr는 스택의 인덱스를 가르키는 것
			throw new OverflowIntStackException();      // 사용자가 만든 예외처리를 강제로 하기 위한 것
		return stk[ptr++] = x;                          // 데이터 x를 전달 받아 배열 stk[ptr]에 저장하고, 스택 포인터를 증가시킴
	}

	// 스택에서 데이터를 팝(정상에 있는 데이터를 꺼냄)
	public int pop() throws EmptyIntStackException {
		if (ptr <= 0)									// 스택이 비어 있음
			throw new EmptyIntStackException();
		return stk[--ptr];                              // 스택 포인터 ptr의 값을 감소시키고, stk[ptr]에 저장된 값을 반환함
	}

	// 스택에서 데이터를 피크(정상에 있는 데이터를 들여다봄) 
	public int peek() throws EmptyIntStackException {
		if (ptr <= 0)									// 스택이 비어 있음
			throw new EmptyIntStackException();
		return stk[ptr - 1];                            // 스택이 비어있지 않으면 꼭대기 요소인 stk[ptr-1]을 반환함
	}

	// 스택에서 x를 찾아 인덱스(없으면 –1)를 반환 , 인덱스 값이 큰값에서 작은 값으로 선형 검색 진행함
	public int indexOf(int x) {
		for (int i = ptr - 1; i >= 0; i--)				// 정상 쪽에서 선형 검색
			if (stk[i] == x)
				return i;								// 검색 성공
		return -1;										// 검색 실패
	}

	// 스택을 비움
	public void clear() {
		ptr = 0;           // 푸시와 팝은 스택 포인터를 바탕으로 이루어지기 때문에 스택 포인터만 비워주면 됨
	}

	// 스택의 용량을 반환
	public int capacity() {
		return max;
	}

	// 스택에 쌓여 있는 데이터 수를 반환
	public int size() {
		return ptr;
	}

	// 스택이 비어 있는가?
	public boolean isEmpty() {
		return ptr <= 0;   // 비어있으면 true, 그렇지 않으면 false로 반환
	}

	// 스택이 가득 찼는가?
	public boolean isFull() {
		return ptr >= max;
	}

	// 스택 안의 모든 데이터를 바닥 → 꼭대기 순서로 출력
	public void dump() {
		if (ptr <= 0)
			System.out.println("스택이 비어 있습니다.");
		else {
			for (int i = 0; i < ptr; i++)
				
				System.out.print(stk[i] + " ");
			System.out.println();
		}
	}
}

class IntStackTester {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		IntStack s = new IntStack(64);	// 최대 64개를 푸시할 수 있는 스택

		while (true) {
			System.out.println("현재 데이터 수：" + s.size() + " / "
															  + s.capacity());
			System.out.print("(1)푸시　(2)팝　(3)피크　" +
								  "(4)덤프　(0)종료：");

			int menu = stdIn.nextInt();
			if (menu == 0) break;

			int x;
			switch (menu) {
			 case 1: 							// 푸시
				System.out.print("데이터：");
				x = stdIn.nextInt();
				try {
					s.push(x);
			 	} catch (IntStack.OverflowIntStackException e) {
					System.out.println("스택이 가득 찼습니다.");
				}
				break;

			 case 2: 							// 팝
				try {
			 		x = s.pop();
					System.out.println("팝한 데이터는 " + x + "입니다.");
			 	} catch (IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
				break;

			 case 3: 							// 피크
				try {
			 		x = s.peek();
					System.out.println("피크한 데이터는 " + x + "입니다.");
			 	} catch (IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
				break;

			 case 4: 							// 덤프
				s.dump();
				break;
			}
		}
	}
}
