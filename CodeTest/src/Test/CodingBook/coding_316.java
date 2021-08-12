package Test.CodingBook;

public class coding_316 {
	public static void main(String[] args) {
		int[] food_times = {3,1,2};
		long k = 5;
		int i = 0;
		
		for(long count = 0 ; count < k ; count++) {
            if(food_times[i] != 0) {
                food_times[i] -= 1;
                i++;
            }
            if(i == food_times.length) {
                i = 0;
            }
        }
		System.out.println(i);
	}
}
