package 자바;


class goods{

    //필드
    String item;
    int price;
    int stock;
    int soldNumber;
    int soldMoney;
    int stockMoney;

    //생성자
    goods(){}
    goods(String item, int price, int stock){
         this.item = item;
         this.price = price;
         this.stock = stock;
    }
    //메소드

    //구매
    void input(int num){
        stock += num;
    }
//판매
    void sold(int num){
        stock -= num;
        soldNumber += num;
    }
//내역출력
    void print(){
        System.out.println("제품명"+item);
        System.out.println("단가"+price);
        System.out.println("총판매량"+soldNumber);
        System.out.println("매출액"+soldNumber*price);
    }

}

public class class4 {
    public static void main(String[] args) {

        goods item1 =new goods("콜라",1000,1);
        item1.input(50);
        item1.sold(10);
        item1.print();
    }
}
