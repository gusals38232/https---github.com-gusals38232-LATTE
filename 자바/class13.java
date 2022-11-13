package 자바;


class Calculator{

    int x1;
    int x2;
    int result;
    Calculator(){}

    Calculator (int x1, int x2){
        this.x1 = x1;
        this.x2 = x2;
    }

    int add(){
        int result = x1 + x2;
        return result;
        
    }

       

    int sub(){
        int result = x1-x2;
        return result;
    }

    int mul(){
        int result = x1*x2;
        return result;
    }

    int div(){
        int result = x1/x2;
        return result;
    }

        //----------------------------------------p2방법.

     //이건 p2가 오버로딩하는 수식.
     int add(int a,int b){
        int result = a + b;
        return result;
        
    }

    int sub(int a,int b){
        int result = a + b;
        return result;
        
    }

    int mul(int a,int b){
        int result = a + b;
        return result;
        
    }

    int div(int a,int b){
        int result = a + b;
        return result;
        
    }

}

public class class13 {
    
    public static void main(String[] args) {
        
        Calculator p = new Calculator(50,20);
        
        p.add();
        System.out.println("합계는 : "+p.add());
        p.sub();
        System.out.println("빼기는 : "+p.sub());
        p.div();
        System.out.println(p.div());
        p.mul();
        System.out.println(p.mul());


        Calculator p2 = new Calculator();
        
        System.out.println(p2.add(2, 3));
        System.out.println(p2.sub(3, 7));
        System.out.println(p2.mul(200, 100));
        System.out.println(p2.div(2, 3));
    }

}
