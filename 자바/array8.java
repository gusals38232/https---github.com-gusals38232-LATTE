package 자바;

public class array8 {
   public static void main(String[] args) {
      
      //비정방형
      int[][] arr = new int[10][]; //행만 정한다
      arr[0] = new int[1];
      arr[1] = new int[2];
      arr[2] = new int[3];
      arr[3] = new int[4];
      arr[4] = new int[5];
      arr[5] = new int[6];
      arr[6] = new int[7];
      arr[7] = new int[8];
      arr[8] = new int[9];
      arr[9] = new int[10];
      
      //값입력
      arr[0][0]= 100;
      arr[1][0]= 200;
      arr[1][1]= 300;
      
      for(int i=0; i<arr.length;i++) {
         for(int j=0;j<arr[i].length;j++) {
            System.out.print("arr["+i+"]["+j+"]="+arr[i][j]+" ");
         }
         System.out.println();
      }
   }

}