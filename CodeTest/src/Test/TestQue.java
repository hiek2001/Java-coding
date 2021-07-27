package Test;
import java.util.*;
public class TestQue {

	public static void main(String[] args) {
		Queue<Integer> que = new LinkedList<>();
		
		que.offer(1);
		que.offer(3);
		System.out.println(que.peek());
		System.out.println(que.poll());
		que.offer(100);
		System.out.println(que.isEmpty());
		
	}
}
