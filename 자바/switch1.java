package 자바;




import java.util.Scanner;
/*
 *    Switch 문
 *           . case, break
 *           . switch(숫자/문자)
 *           
 *           . switch(값){
 *                case 값: 실행문; break;
 *                case 값: 실행문; break;
 *                case 값: 실행문; break;
 *                case 값: 실행문; break;
 *              }
 *                case 1 : case 2   case 3:
 *                case 4 : 겨울입니다; break;
 */



public class switch1 {

   public static void main(String[] args) {
      
       
      int num1 = 7, num2 = 12;
      
      //switch 문을 활용해서 연산자(+,-등)를 입력받아서 
      // 해당하는 case문을 만들어서 결과를 출력하시오.
      
      System.out.println("연산자를 입력하시오>>");
      Scanner sc = new Scanner(System.in);
      String str = sc.next();
      
      switch(str) {
      case "+" : System.out.println("덧셈: "+(num1+num2)); break;
      case "-" : System.out.println("뺄셈: "+(num1-num2)); break;
      case "*" : System.out.println("곱셈: "+(num1*num2)); break;
             // OS가 *을 사용하므로 *로 처리하지않고 X로 처리한다.
      case "/" : System.out.println("나눗셈: "+(num1/num2)); break;
      case "%" : System.out.println("나머지: "+(num1%num2)); break;
       default: System.out.println("그런 연산자는 없습니다.");
      }
      
      
   }

}