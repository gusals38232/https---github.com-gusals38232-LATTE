package 자바;

import java.security.AuthProvider;
import java.util.Scanner;

public class if2 {

    public static void main(String[] args) {
        
                int score =  0;
                Scanner sc =new Scanner(System.in);

                System.out.println("점수입력하시오");
                score = sc.nextInt();

                if(score >=97){
                    System.out.println("A+");
                }
                else if ( score>= 94){
                    System.out.println("A");
                }
                else if ( score>= 87){
                    System.out.println("B+");
                }
                else if ( score>= 84){
                    System.out.println("B");
                }
                else if ( score>= 77){
                    System.out.println("C+");
                }
                else if ( score>= 74){
                    System.out.println("C");
                }
                else if ( score>= 67){
                    System.out.println("D+");
                }
                else if ( score>= 64){
                    System.out.println("D");
                }
                else if( score<= 57){
                    System.out.println("F");
                }
                

               

        

        
    }
    
}
