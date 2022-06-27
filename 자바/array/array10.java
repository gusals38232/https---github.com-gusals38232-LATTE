package 자바.array;

public class array10 {

    public static void main(String[] args) {
        
      int [][] arr =  {{10,11,12},{20,21,22,23,24},{30,31},{40,41,42}};
     
      for(int i=0; i<arr.length; i++){
        int[]inArr = arr[i];
        for (int j = 0; j < inArr.length; j++) { System.out.print(inArr[j] + " "); } 
                   System.out.println();
        

        
      }
        
    }
    
}
