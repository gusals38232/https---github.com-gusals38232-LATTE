package 자바;

import java.util.Scanner;

class Product{
    String name;
    int price;
    int stock;
    int sold;

    Product(String name, int price, int stock, int sold){
    this.name = name;
    this.price =price;
    this.stock = stock;
    this.sold = sold;
    }
}

    String getName(){
        return name;
    }

    int getPrice(){
        return price;
    }
    int getStock(){
        stock -= sold;
        return stock;
    }
    int getSold(){

        return sold;
    }



public class class15 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
               

        
        Product[] arr = new Product[3];
        System.out.println("제품명,가격,재고량,판매량 차례로 입력하세여");

        for(int i=0; i<arr.length; i++){

            String name = sc.next(); //next문자
            int price = sc.nextInt();//nextint는 숫자
            int stock = sc.nextInt();
            int sold = sc.nextInt();
            
            arr[i]= new Product(name, price, stock, sold);
            System.out.println((i+1)+"번쨰 제품 등록할래여?");
            System.out.println("계속? (y/n");
            String flag =sc.next();
            
        }

        //객체출력
        for(int i=0 ; i<arr.length; i++){

        }
        sc.close();

    }
}
