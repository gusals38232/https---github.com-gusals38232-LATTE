package 자바;

import java.util.Scanner;

public class ex3 {

   public static void main(String[] args) {

      System.out.println("끝낼 숫자를 입력해주세요>>");
      
      Scanner sc = new Scanner(System.in);
      int fin = sc.nextInt();
      sc.close();
      
      for(int i = 1; i <= fin; i++)
      {
         if(i < 10)
         {
            if(i % 10 == 3 || i % 10 == 6 || i % 10 == 9)
            {
               System.out.print("짝 ");
            }
            else
            {
               System.out.print(i + " ");
            }
         }
         else
         {
            if(i / 10 == 3 || i / 10 == 6 || i / 10 ==9)
            {
               if(i % 10 == 3 || i % 10 == 6 || i % 10 == 9)
               {
                  System.out.print("짝짝 ");
               }
               else
               {
                  System.out.print("짝 ");
               }
            }
            else
            {
               if(i % 10 == 3 || i % 10 == 6 || i % 10 == 9)
               {
                  System.out.print("짝 ");
               }
               else
               {
                  System.out.print(i + " ");
               }
            }
         }
      }

   }

}