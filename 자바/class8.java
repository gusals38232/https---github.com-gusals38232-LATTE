package 자바;

class Car{
    String color;
    int speed;
    void print(){
        System.out.println("색깔"+color);
        System.out.println("속도"+speed);
        System.out.println("-----------");
    }
}
public class class8 {
    
    public static void main(String[] args) {
    
        Car car1 = new Car();
        car1.color = "빨강";
        car1.speed = 100;

        Car car2 = new Car();
        car2.color = "노랑";
        car2.speed = 120;

        car1.print();
        car2.print();
    }
    
}
