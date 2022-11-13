package 자바;

public class class1 {
    
}




// 설계도
class 동물 {
   // 필드    
   String str;
   
   // 생성자      <- 사용자가 생성하지 않을 시 JVM에서 기본생성자를 생성함
   동물(){}   // <- 기본생성자 (중괄호와 괄호만 있음, 실행문이 없다)
   
   동물(String str){
      this.str = str;
      System.out.println(str);
   }
   
   // 메소드 (return값이 없을 때는 void를 사용)
   // 데이터 반환타입이 없다면 void, 있다면 반환타입의 데이터타입을 맞춰줘야 한다.
   void print() {
      System.out.println(str+"소리를 내며 웁니다");
      
   }
}
   






// 실행클래스 - main() 메소드가 있는 클래스이고, 여기서, 만들어 놓은 설계도 클래스를 가져다 활용한다.
public class Class01 {
   public static void main(String[] args) {
      // 객체생성 ('동물'이라는 클래스 타입을 object1이라는 이름으로 선언,
      동물 object1 = new 동물(); // '동물' 클래스의 '동물' 생성자를 호출
      
      // 필드와 메소드 활용
      object1.str = "응애~";   //필드에 접근
      object1.print();      //메소드에 접근
      
      동물 object2 = new 동물("야옹"); // <- '동물'생성자 중에 매개변수 1개가 있는 생성자로 찾아감
      object2.print();
   }
}