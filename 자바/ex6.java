package 자바;

import java.util.Scanner;

public class ex6 {

    public static void main(String[] args) {
        
        System.out.println("주민등록번호-를 붙여서 입력해줘");
        Scanner sc = new Scanner(System.in);

        sc.useDelimiter("\\s|-");
        System.out.println("주민번호 앞자리는"+sc.next()+"입니다");
        System.out.println("주민번호 뒷자리는"+sc.next()+"입니다");

        sc.close();
    }
    
}
