package 자바;

class book{

    String title;
    String author;

    book(){}
    book(String title){
        this.title = title;
    }
    book(String title, String author){
        this.title =title;
        this.author = author;
    }

}
public class class10 {
    public static void main(String[] args) {
        book book1= new book();
        book book2 = new book("어린왕자");
        book book3 = new book("춘향전","작자미상");

    }
}
