package 자바;

/* 
 *  Integer.parseInt("문자숫자") : "문자숫자" --->숫자
 *  Integer.toString(숫자)       : 숫자 --->"문자숫자"
 */
public class if1 {
    public static void main(String[] args) {

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        if(num1>0)  {
            System.out.println(num1 +"는 양수입니다");
        }else{
            System.out.println(num1+"는 음수입니다.");
        }

        if(num2>0)  {
            System.out.println(num2 +"는 양수입니다");
        }else{
            System.out.println(num2+"는 음수입니다.");
        }

        
    }
    
}
