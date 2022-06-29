package 자바.array;

/* 
 * 2차원 배열 : 행,열
 * 
 *  구현방법: 타입[][]arr = new타입[행][열]
 */

public class array7 {

    public static void main(String[] args) {
        int[][] arr =new int[2][3];

        arr[0][0]  = 7;
        arr[0][1]  = 23;
        arr[0][2]  = 11;

        arr[1][0]  = 31;
        arr[1][1]  = 41;
        arr[1][2]  = 51;

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++){
                System.out.println(arr[i][j]+"");
            }
            System.out.println();
        }
        System.out.println("-----------------------");
        for(int[] i:arr){
            for(int j :i) {
                System.out.println(j+"");
            }
            System.out.println();
        }

    }
    
}
