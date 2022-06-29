package 자바;

class Add{

    void add(int x1, int x2)    {
        System.out.println(x1+x2);
    }

    void add(int x1, int x2, int x3)    {
        System.out.println(x1+x2+x3);
    }

}

public class class11 {
    public static void main(String[] args) {
        
        Add result = new Add();
        result.add(10,20);
        result.add(10, 30, 40);

    }
}
