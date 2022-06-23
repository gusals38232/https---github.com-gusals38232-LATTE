package 자바;


/* 
    ~ : 1->0, 0->1

    *음수 : 반대로,,, +1 >> 최상위 비트는 음수

 * 
 */

public class operator3 {
    public static void main(String[] args) {
     
            byte num1 = 10;
            int num2 =  ~num1;
            int num3 = num2 +1;

            System.out.println("양수:"+num1);
            System.out.println("음수:"+num3);
    }
    
}
