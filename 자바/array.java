package 자바;
/* 
 * 1. 참조변수
 *      -기본데이터타입 변수 :   boolean,char,short,int,long, float, double 
 *      -참조변수           :   배열,열거, 객체, 인터페이스
 * 
 * 2.JVM메모리영역 - 운영체제에서 할당받은 메모리영역
 * char str = 'A'
 * if(str == 'A') {
 *  int num1 = 100;
 * double num2 =3.14;
 * }
 * boolean num4 = true;
 * 
 * int[] score = {10,20,30}
 * 
 * 3.연산자 ==, !=??
 *  .기본데이터 타입 : 값이 같으냐? 다르냐?
 *  .참조데이터 타입: 주소가 같으냐/(같은객체냐)
 * 
 * 4.참조 변수 : 초기화를 null로 지정할 수 있다.
 * 
 * 5.배열(Array)
 *        배열을 왜 만드냐
 *          -변수는 하나의 값만 저장하므로, 많은 동일한 유형의 변수를 중복 발생시키면 비효율적
 *         -그래서 하나의 변수로관리, 인덱스 활용하는 자료구조\
 *        .특징 : 고정형
 *         .구현방법 
 *                  생성:int[] arr = new int[3];  >> arr---> [int][int][int]
 *                  초기화: arr[0] = 값
 * 
 *                  생성/초기화: int[] arr = new int[]{값,값,값,,}
 *                  생성/초기화 : int[] arr = {값,값,값,,,}
 * 
 *          .배열의 길이: length
 *                                       0 1 2 3 4 5 6
 *                              arr----->[][][][][][][] length:7 
 */      

public class array {

    public static void main(String[] args) {
        int[] arr = new int[3];

        arr[0] =1;
        arr[1] =2;
        arr[2] =3;

        for(int i=0; i<arr.length; i++){
        System.out.println(arr[i]);
        }

        int[] arr2 = arr;
        for(int i=0; i<arr2.length; i++){
            System.out.println(arr2[i]);
            }

        for(int num: arr) {
            System.out.println(num);
        }

    }
    
}
