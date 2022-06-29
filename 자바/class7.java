package 자바;

/*


*/

class Parking{
   String name;
   int inTime;
   int outTime;
   static final int AMTPERTIME = 3000; //못바꾸게,
   
   Parking(String name, int inTime, int outTime){
      this.name = name;
      this.inTime = inTime;
      this.outTime = outTime;
   }
   void print() {
      int fee = (outTime-inTime);
      System.out.println("차량명 :"+name);
      System.out.println("입고시간"+inTime);
      System.out.println("출고시간"+outTime);
      System.out.println("주차요금"+fee);
   }
   
}

public class class7 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      
      Parking car1 = new Parking("소나타",10,14);
      Parking car2 = new Parking("제네시스",9,21);
      Parking car3 = new Parking("카니발",9,18);
      
      car1.print();
      System.out.println("========================");
      car2.print();
      System.out.println("========================");
      car3.print();
      
      
      
   }

}