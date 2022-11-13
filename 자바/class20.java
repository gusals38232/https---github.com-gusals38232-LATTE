package 자바;

class protectedB extends ProtectedA{

    protected int b;
    protected void b(){
        b=5;
        a=50;
        str();
        printA();

    }

    protected void printB   {
        System.out.println(b);
    }
}

public class class20 {
    public static void main(String[] args) {
        protectedB obj = new protectedB();
        int value = obj.b;
        obj.b();
        obj.printB();
    }
}
