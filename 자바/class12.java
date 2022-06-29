package 자바;

class Shape{

        //정사각형 넓이 생성자
        void square(int x1)
        {
            System.out.println("정사각형 넓이는"+(x1*x1)+"입니다");
        }

        void rect(int x1, int x2){
            System.out.println("직사각형의 넓이는"+(x1*x2)+"입니다");
        }

        void square2(int x1, int x2 ,int x3){
            System.err.println("직육면체의 부피는"+(x1*x2*x3)+"입니다");
        }
        

}


public class class12 {

        public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);
            Shape shape = new Shape();
            
            while(true)
            {
               System.out.println("-------------------------------------");
               System.out.println("1.정사각형 | 2.직사각형 | 3.직육면체 | 4.종료");
               System.out.println("-------------------------------------");
               System.out.println("선택>");
               int number = sc.nextInt();
               
               if(number == 1)
               {
                  System.out.println("정사각형의 한 변의 길이를 입력해주세요>");
                  int side = sc.nextInt();
                  shape.square(side);
               }
               else if(number == 2)
               {
                  System.out.println("직사각형의 가로, 세로의 길이를 입력해주세요>");
                  int side1 = sc.nextInt();
                  int side2 = sc.nextInt();
                  shape.rect(side1, side2);
               }
               else if(number == 3)
               {
                  System.out.println("직육면체의 가로, 세로, 높이를 입력해주세요>");
                  int side1 = sc.nextInt();
                  int side2 = sc.nextInt();
                  int side3 = sc.nextInt();
                  shape.square2(side1, side2, side3);
               }
               else if(number == 4)
               {
                  break;
               }
               else
               {
                  System.out.println("잘못된 명령입니다.");
               }
            }
            sc.close();
            System.out.println("프로그램 종료");
      
         }
      
      }


