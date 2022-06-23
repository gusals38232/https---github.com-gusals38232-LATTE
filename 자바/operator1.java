package 자바;
/* 
 * 
 *   num++ : num = num +1, value = num++ +1
 *  ++num : num = num + 1, value = ++num +1
 */

public class operator1 {

    public static void main(String[] args) {

        int num1 = 10;

        //후위증감

        int num2 = num1++;
        

        System.out.printf("후위증감:num2=%d, num1=%d\n",num1,num2);   
    }
    
}
