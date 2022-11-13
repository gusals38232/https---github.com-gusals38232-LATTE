package 자바;

import java.util.Scanner;

public class array12 {
    public static void main(String[] args) {
        
        boolean run = true;
        int studentNum = 0;
        int[] scores = null;
        Scanner sc = new Scanner(System.in);
        
        while(run) {
            System.out.println("-------------");
            System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
            System.out.println("-------------");
            System.out.println("메뉴를 선택해 주세요");

            int selectNo = sc.nextInt();
            if(selectNo==1){
                        //학생수: ?
                        System.out.println("학생 수>>");
                        studentNum = sc.nextInt();
                        scores = new int[studentNum];
            }else if(selectNo==2){

                        //배열 3개크기를 만들어서 3번을 입력받는다

                        scores = new int[studentNum];
                    
                        for(int i =0; i<scores.length; i++){
                            if(i<scores.length){
                            scores = sc.nextInt();
                            scores[i] = score;
                        }
            }else if(selectNo==3){
                //입력되어 있는 배열의 값들을 출력한다.
                for(int i =0; i<studentNum; i++){
                    System.out.println("scores["+i+"]: "+scores[i]);
                }
            }else if(selectNo==4){
                int max= 0;
                int sum= 0;
                double avg = 0.0;
                for(int i =0; i<studentNum; i++){
                    sum+= scores[i];
                    if(scores[i]>max){
                        max = scores[i];
                    }
                }
                avg = (double)sum/studentNum;
                System.out.println("최고점수:"+max);
                System.out.println("평균점수:"+avg);
                //최고점수:?
                //평균점수:?
            }else if(selectNo==5){
                run= false;
                //종료
            }
        }
        System.out.println("프로그램을 종료합니다.");
    }
}


// 안되면 이걸로

/* package array;

import java.util.Scanner;

public class ArrayEx_2 {
   public static void main(String[] args) {
      
      
      Scanner sc = new Scanner(System.in);
      int input; 
      int studentNum = 0;
      int[][] a = new int[studentNum][];
      double max = 0;
      double min = 120;
      double avg = 0;
      int sum = 0;
      while(true) {
         System.out.println("--------------------------------------");
         System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
         System.out.println("--------------------------------------");
         System.out.println("메뉴를 선택하십쇼 >>");
         input = sc.nextInt();
         if(input == 1) {
            System.out.println("학생 수를 설정하세요 >>");
            input = sc.nextInt();
            studentNum = input;
            a = new int[studentNum][];
         }
         else if(input == 2) {
            int input1;
            int input2;
            int input3;
            System.out.println("각 과목(국어,영어,수학) 점수를 입력하세요 >>");
            for(int i = 0; i<studentNum; i++) {
               System.out.println((i+1)+"번 째 학생의 점수를 입력해주세요");
               input1 = sc.nextInt();
               input2 = sc.nextInt();
               input3 = sc.nextInt();
               a[i] = new int[] {input1,input2,input3};
            }
            
         }
         else if(input == 3) {
            System.out.println("점수리스트는 다음과 같습니다");
            for(int i = 0; i<a.length; i++) {
               for(int j = 0; j<a[i].length; j++) {
                  System.out.print(a[i][j]+" ");
               }
               System.out.println("");
            }
         }
         else if(input == 4) {
            System.out.println("분석 메뉴입니다");
            for(int i = 0; i<a.length; i++) {
               for(int j = 0; j<a[i].length; j++) {
                  if(a[i][j]>max) max=a[i][j];
                  if(a[i][j]<min) min=a[i][j];
                  sum += a[i][j];
                  avg = sum/(a[i].length*studentNum);
               }
               
            }            
            System.out.printf("최고 점수는 %.2f점, 최저 점수는 %.2f점, 평균은 %.2f점 입니다 \n",max,min,avg);
         }
         else if(input == 5) {
            System.out.println("시스템을 종료합니다");
            break;
         }
         else {
            System.out.println("잘못 입력하셨습니다");
         }
      }
   }
} */


