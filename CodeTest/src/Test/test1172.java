package Test;

import java.util.*;

public class test1172 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data[] = new int[3];
        for(int i=0 ; i<3; i++) {
            int n = sc.nextInt();
            data[i]=n;
        }
        
        Arrays.sort(data);
        for(int i : data) {
        	System.out.print(i+" ");
        }
        
        for(int i=0 ; i<data.length ; i++) {
        	System.out.print(data[i]+" ");
        }
    }
}
