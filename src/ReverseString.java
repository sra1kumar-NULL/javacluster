// Sample Input

// madam
// Sample Output

// Yes

import java.util.*;
import java.io.*;

public class ReverseString{

    public static void main(String[] args){

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder("");
       try{
            sb.insert(0,br.readLine());
       }
             
          
           
       
         catch(IOException e){
             System.out.println(e);
         }
          
       System.out.println( sb.equals( new StringBuilder(sb).reverse().toString()) 
    ? "Yes" : "No" );
    }


}
