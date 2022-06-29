package 자바;

public class array5 {
    public static void main(String[] args) {
        
        int[] num = new int[] {1,2,3,4,5,6,7,8,};

        int sum = 0;
        double avg;

        int min=120, max=0  ;
        for(int i=0; i<num.length;i++) {
            sum+=num[i];

            if (num[i]>max) max=num[i];
            if (num[i]<min) min=num[i];
        }
        avg = sum/(num.length);


        System.out.println("합계:"+sum);
        System.out.println("평균:"+avg);
        System.out.println("최대값:"+max);
        System.out.println("최소값:"+min);
    }
    
}
