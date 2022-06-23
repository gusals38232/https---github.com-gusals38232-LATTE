package 자바;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        
        System.out.println("연도입력");

        Scanner sc = new Scanner(System.in);
        System.out.println("연도입력");

        int year = sc.nextInt();


        if(year%4==0 year%100 != 0 || year%400==0){
            System.out.println("윤년입니다");
        }else{

        }


    }
    
}
