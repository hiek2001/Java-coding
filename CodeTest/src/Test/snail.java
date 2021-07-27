package Test;

public class snail {
	    public static void main(String[] args) {
	        int[][] snail = new int[3][3];
	        
	        int print = 3;
	        int k = 1;
	        int right = -1;
	        int bottom = 0;
	        int top = 1;
	        
	        for(int i=5; i>0; i--) {
	            
	            for(int j=0; j<print; j++) {
	                right += top;
	                snail[bottom][right] = k;
	                k++;
	            }
	            
	            print--;
	            
	            for(int j=0; j<print; j++) {
	                bottom += top;
	                snail[bottom][right] = k;
	                k++;
	            }
	            
	            top = top * (-1);
	        }
	        int answer=0;
	        // 출력
	        for(int i=0; i<snail.length; i++) {
	            for(int j=0; j<snail[i].length; j++) {
	        	   if(i==j)
	        		   answer+=snail[i][j];
	            }

	        }
	        System.out.print(answer);
	    }
}
