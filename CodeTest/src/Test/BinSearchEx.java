package Test;

class BinSearchEx {

	static int BinSearch(int[] a, int n, int key) {
		int pl=0, pr=n-1;
		int pc=(pl+pr)/2;
		
		for(int i=0 ; i<n ; i++) {
			if(a[pc]==key) 
				return pc;
			else if(a[pc] < key) 
				pl = pc+1;
			else 
				pr=pc+1;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int a[] = {1,3,6,5,6,8,9};
		
		System.out.print("  |");
		for(int i=0 ; i<7 ; i++) {
			System.out.print(i+"  ");
		}
	}
}
