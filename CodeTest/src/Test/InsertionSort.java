package Test;

public class InsertionSort {
	  public static void main(String[] args) {
	    int[] arr = {5,2,1,4,3};
	    int temp;
	    
	    for(int i=1 ; i<arr.length; i++) {
	      for(int j=i ; j>0 ; j--) {
	        if(arr[j] < arr[j-1]) {
	         temp = arr[j];
	         arr[j] = arr[j-1];
	         arr[j-1] = temp;
	        }  
	        else break;
	      }
	    }
	    for(int num : arr) 
	    System.out.println(num);  
	  }
	}
