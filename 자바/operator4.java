package 자바;

import java.util.Scanner;

/* 
 * 
 *  shift연산자 
 * <<. >> : 1비트씩 왼족으로,, 오른쪽
 */

public class operator4 {
    public static void main(String[] args) {
        
       System.out.println("양수인지 음수인지 판단하고 싶은 수를 입력하세요>>");
        Scanner sc =new Scanner(System.in);

        int num = sc.nextInt();

    //    int num = System.in.read()-48;    

       if(num>0) System.out.println(num+"양수입니다");
       else System.out.println(num+"음수입니다");
    }
    
}
