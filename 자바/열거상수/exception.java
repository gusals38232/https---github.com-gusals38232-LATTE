package 자바.열거상수;

import java.util.Scanner;

/*
       예외처리
       - 문법상에는 문제가 없으나 실행중 오류를 발생하여
                 프로그램을 중지시킬수 있는 코드를 정상실행상태로 유지하는 것
      문법
           
              try{
                     -------
                     -------(예외)
                     -------
                     -------
              
              }catch(예외클래스 e){
                  //오류발생시 수행해야할 코드
              }catch(예외클래스 e){
                  //오류발생시 수행해야할 코드
              }finally{
                  //정상이든 비정상든 처리후에 꼭 해야할 일              
              }
         . 예외종류
         
           1  .  정수를 0으로 나누었을 경우 : ArithmeticException
              . null레퍼런스를 참조할경우: NullPointerException
              .배열의 크기보다 더 큰 인덱스참조 : ArrayIndexOutOfBoundException
              .입출력 동작 실패 또는 인터럽트 발생시..: IOException
           
*/
public class exception {

   public static void main(String[] args) {
   
      Scanner sc = new Scanner(System.in);
      int divisor;
      int dividend;
        try{
      System.out.println("나뉨수>>>");
      dividend=sc.nextInt();
      System.out.println("나눌수>>>");
      divisor = sc.nextInt();

    
      System.out.println(dividend/divisor);
        }catch(ArithmeticException e){
            System.out.println("0으로 나뉠수 없습니다.");
        }
   }

}