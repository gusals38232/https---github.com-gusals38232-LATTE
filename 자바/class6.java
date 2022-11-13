package 자바;
/* 
 *  변수
 * 
 *      .멤버변수
 *      .지역변수
 *      .매개변수
 *      .인스턴스(객체)변수
 *      .클래스 변수 -static이 붙은것
 *                      .객체간 공유된다. 따라서 주의할 점 있어.
 *                       .static이 붙은 것은  static만 호줄할 수 있다.
 * 
 *          .final 붙은 변수/메소드
 *  .                   .중간에 값은 변경할 수 없다.
 *                      .
 */
class Variable{
    int a;
    String b;
    static int c;

    void print() {
        int d =3;
        System.out.println("멤버변수 a값은 "+a+",멤버변수 b값은"+b+"클래스변수 c값은
        "+c+"d값은"+d);
    }
}


public class class6 {

    static void print(){
        System.out.println();
    }

    public static void main(String[] args) {
        Variable.c=20;

        Variable var = new Variable();
        var.a = 10;
        var.b = "20";
        var.c =20;
        var.print();

        Variable var2 = new Variable();
        var2.print();
        

    }
}
