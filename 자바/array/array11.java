package 자바.array;

public class array11 {
    public static void main(String[] args) {
        
        int[][] arr = {{95,86},{83,92,96},{78,83,93,87,88}};


        int sum= 0;
        double avg;
        

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                sum += arr[i][j];
            
            }
        }
        System.out.println("합계="+sum);
         avg = (double)sum/arr.length;
        System.out.println("평균="+avg);
        System.out.println("평균:"+String.format("%.2f",avg));
        //합계
        //평균을 구해서 출력하세요.
    }
    
}
