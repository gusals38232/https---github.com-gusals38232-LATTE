package 자바;
/* 클래스

    .자바프로그래밍단위
    .java 파일에 여러개 클래스 존재할때는 public은 1개여야.. 그래도 컴파일하며 .class는 개별생성
    .구성요소
        -필드 : 전역변수와 같이 메소드간 공유
        -생성자 :클래스 이름과 같다.초기화역할, 기본 생성자
                오버로딩 -같은 이름의 생성자나 메소드가 존재할때 매개변수의 타입, 수, 순위를 보고 알아서 호출
                
        -메소드 : 기능을 구현

    .변수의 종류
        -멤버변수 : 필드의 일반변수
        -클래스변수 : static이 붙은 변수
                        .클래스가 실행되면 가장먼저 메모리에 올라온다.
                        .객체간 공유할수 있다.
        -매게변수   : 생성자나 메소드(매개변수,매개변수)    
        -인스턴스변수 : Student s = new Student()
        for,if문은 메소드안에서 사용되어야 함


객체배열 
    ;배열안에 객체를 넣어 활용하는 것
    -구성 : 배열, 객체들도 필요하다

        1)배열을 생성한다. - 무엇을 담을 것이냐? 
        클래스[] 참조변수 = new 클래스[10];
        2)객체를 만든다.  -클래스 객체변수1 = new 클래스();

        arr-->[객체변수1][객체변수2][][][][][]

  */       

class Student {
    
    String name;
    String tel;
    int age;


    Student(String name, String tel, int age){
                this.name = name;
                this.tel = tel;
                this.age = age;

            }

            String getName() {
                return name;
            }

            String getTel(){
                return tel;
            }

            String getAge(){
                return age;
            }


    }


public class class14 {
    
    public static void main(String[] args) {
        
        Student[] arr = new Student[3];

       /*  Student st1 = new Student("홍길동", "010", 30);
        Student st2 = new Student("손흥민", "020", 20);
        Student st3 = new Student("이순신", "030", 40); */
    
        //위에처럼 할필요없고 그냥 배열을 통해서 arr[0] = 이렇게 하면 짧아짐
    arr[0] = new Student("홍길동", "010", 30);
    arr[1] = new Student("손흥민", "020", 20);
    arr[2] = new Student("이순신", "030", 40);


    for(int i=0; i<arr.length;i++){

            
            String name =arr[i].name;
            String tel = arr[i].tel;
            int age = arr[i].age;
            System.out.println(name+"학생전화는"+tel+"이고 나이는"+age+"입니다.");
    }
    }
}
