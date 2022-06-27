package 자바.열거상수;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/* 
 * throws 처리
 *      내가(메소드) try~catch를 하지않고 나를 호출하는 곳에서 처리하도록 던지는것
 *      이 경우 호출한 곳에서는 반드시 try~catch문 안에서 호출해야 한다.
 */
class A{
    void kkk() throws FileNotFoundException,ArithmeticException{
        
        int sum = 0;
        sum =1000/0; //예외발생되었슴

        FileInputStream fio = new FileInputStream("./file/p.txt");
    }

    void ppp() {

    }
}

public class exception3 {
    public static void main(String[] args) {
     
        try {
            a.kkk();
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌수 없습니다.");
        } catch (FileNotFoundException e){
            System.out.println("파일을 찾을 수 없습니다.");
        }
    }
    
}
