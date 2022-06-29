package 자바;

import 자바.A;
/* 접근지정자
        ;변수/메소드의 접근을 제한하는것 
        .종류
            -private  선언 클래스 안에서만
            -default 같은패키지 안에서는 사용가능
            -protected 상속관계 있는 다른 패키지에 있는 클래스는 접그 ㄴ가능.
            -public 다른 패키지까지 모두 사용가능하다.
        
        */

class B extends A {
    void m() {
        System.out.println(super.name);
    }
}



public class class18 {
    public static void main(String[] args) {
        A a= new A();
        String value = a.name;
        a.getName();
    }
}
