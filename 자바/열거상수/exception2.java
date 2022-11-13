package 자바.열거상수;

public class exception2 {

    public static void main(String[] args) {
        
        int[] arr = new int[5];

        arr[0] = 100;

        try {
            arr[5] =200;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열의 범위를 초과했습니다.");
        }

        
    }
    
}
