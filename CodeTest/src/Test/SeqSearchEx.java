package Test;
import java.util.*;
class SeqSearchEx {
	
	static int seqSearch(int[] a, int key) {
		int i=0;
		
		for(i=0 ; i<7 ; i++) {
			if(a[i]==key)
				return i;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] data = {6,4,3,2,1,9,8};
		int i;
		Scanner sc = new Scanner(System.in);
		int key =sc.nextInt();
		
		int idx = seqSearch(data, key);
		
		for(i=0 ; i<7 ; i++) {
			if(idx==-1) {
				System.out.print(" ");
			}
			else {
				System.out.println("*");
			}
			System.out.println(data[i]+" ");
		}
		
		System.out.println(key+"은 x["+idx+"]에 있습니다.");
	}
}
