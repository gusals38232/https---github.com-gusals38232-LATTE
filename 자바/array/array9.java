package 자바;

public class array9 {
   public static void main(String[] args) {
      
      int[][] arr = new int[4][];
      arr[0] = new int[] {1,2,3};
      arr[1] = new int[] {1,2};
      arr[2] = new int[] {1};
      arr[3] = new int[] {1,2};
      
      for(int i=0; i<arr.length; i++) {
         for(int j=0; j<arr[i].length;j++) {
            int value = arr[i][j];
            System.out.print(value+" ");
            
            if(j>arr[i].length) {
               System.out.println();
            }
         }
      }
      
      //*****************************************************
      int [][] arr2 = { {1,2,3},{1,2},{1},{1,2}};
      for(int[] i: arr2) {
         for(int k: i) {
            System.out.print(k);
         }
         System.out.println();
         
      }
      
    }

}