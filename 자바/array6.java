package 자바;

public class array6 {

    public static void main(String[] args) {
        
        int[] num = new int[] {1,2,3,4,5,6,7,8,};

        int imsi = 0;
        for(int i=0; i<num.length; i++) {
            for(int j=0; j<num.length; j++){

                if(num[i] > num[j]){
                    imsi = num[i];
                    num[i] = num[j];
                    num[j] = imsi;
                }
            }
        }
        System.out.println("정렬된 값은");
        for(int n :num){
            System.out.println(n+" ");
        }
    }
    
}
