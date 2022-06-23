package 자바;

public class operator2 {
    public static void main(String[] args) {
        
        int num1 =10;
        int num2 = 5;
        int result = num1 & num2;

        /* 
         * 16 8 4 2 1
         * 
         */

        System.out.println(result);

        result = num1 | num2;

        System.out.println(result);

        result = num1 ^ num2;
    }
}
