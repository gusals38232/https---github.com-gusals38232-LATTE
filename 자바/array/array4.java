package 자바.array;

public class array4 {
    
    public static void main(String[] args) {
        //정수배열 5개크기 만들어 생성
        //입력 전체값 출력
        // 합계 과목수 평균을 출력

        int[] a;
        a = new int[5];

        a[0] = 1;
        a[1]=2;
        a[2]=3;
        a[3]=4;
        a[4]=5;

        int[] b ;
        b= new int[] {1,2,3,4,5};


        int[] c = {1,2,3,4,5};

        
        int sum = 0;
        double avg;
        
        

        for(int i=0; i<c.length; i++)   {
            sum += num[i];

            System.out.println("합계는"+sum+"입니다.");
        }
        
    }
}
