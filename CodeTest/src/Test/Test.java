package Test;

public class Test {
    public static void main(String[] args) {
        String text = "┌┬┐├┼┤└┴┘";
        String[] array = new String[9];
        //유니코드로 변환
        for(int i = 0; i < text.length(); i++) {
        	array[i] = String.format("0x%04X%n",(int)text.charAt(i)); 
        	System.out.println(array[i]);
        }

      
    }	
}
