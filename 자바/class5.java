package 자바;

import java.util.Scanner;

// 두 수(시작값, 끝값)의 범위를 입력받아서.... 
// 합계구하기(allSum, 짝수합계 구하기(evenSum), 홀수합계구하기(oddSum)
class SumOddEven{
   int sum;
   
   SumOddEven(){}
   
   int allSum(int a, int a2) {
      
      for(int i=a; i<=a2; i++) {
         sum += i;
      }
      return sum;
   }
   int evenSum(int a, int a2) {
      for(int i =a; i<=a2; i++) {
         if(i % 2 !=0) {
            continue;
         }
         sum += i;
      }
      return sum;
   }
   
   int oddSum(int a, int a2) {
      for(int i =a; i<=a2; i++) {
         if(i % 2 ==0) {
            continue;
         }
         sum += i;
      }
      return sum;
   }
   
}

public class class5 {
   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      System.out.println("최소값을 입력해주세요.");
      int a = sc.nextInt();
      System.out.println("최대값을 입력해주세요.");
      int a2 = sc.nextInt();
      SumOddEven all = new SumOddEven();
      
      
      System.out.println("범위 내 수의 합:"+all.allSum(a,a2));
      all.sum =0;
      System.out.println("범위 내 짝수의 합:"+all.evenSum(a,a2));
      all.sum =0;
      System.out.println("범위 내 홀수의 합:"+all.oddSum(a,a2));
      
      
      
      
   }
}