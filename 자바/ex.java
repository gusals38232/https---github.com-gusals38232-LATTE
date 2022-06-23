package 자바;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ex {

    public static void main(String[] args) {
        
            

        System.out.println("대소문자 변환");
        InputStreamReader rd = new InputStreamReader(System.in);

        int num; 
        
        while(true) {
            try {
                num = rd.read();

                    if(num == -1){
                        break;
                    }
                    else if (num == '\n' || num == 'r') {
                        continue;
                    }

                    if (num>'a' && num<='z'){
                        num = num-('a'-'A');
                    }else if(num>='A' && num<='Z'){
                        num = num-('a'-'A');
                    }else {
                        System.out.println("알파벳 아님");
                        continue;
                    }

                    System.out.println((char)num);
                    

            } catch(IOException e){
                System.out.println("잘못입력");
            }
        }
         System.out.println("종료 데스");
    }
    
}
