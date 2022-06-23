package 자바;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        System.out.println("두점을 입력하시오");

        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        if(

        (
            ((x1>50 && x1<=100) && ((y1>=50 && y1<=100) || (y2>=50 && y2 <=100)))
        ) || ( ((x1<=50 && x2>=100) && (y1<=50 && y2>=100)))
        )
        
        
        {
            System.out.println("사각형이 겹칩니다.");
        }else{
            System.out.println("사각형이 겹치지 않습니다.");
        }

    }
    
}
