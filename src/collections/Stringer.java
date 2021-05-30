package collections;

//Sample Input 0
//
//hello
//java
//Sample Output 0
//
//9
//No
//Hello Java
import java.io.*;
import java.util.*;
import java.lang.*;

public class Stringer {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int sum  = A.length()+B.length();
        System.out.println(sum);
        int cmpr =A.compareTo(B);
        if(cmpr<0) {
        	System.out.println("No");
        }
        else if(cmpr>0) {
        	System.out.println("Yes");
        }
        System.out.println(Character.toString(A.charAt(0)).toUpperCase()+A.replaceFirst(Character.toString(A.charAt(0)),"" ));
        System.out.println(Character.toString(B.charAt(0)).toUpperCase()+B.replaceFirst(Character.toString(B.charAt(0)),"" ));
        		
        sc.close();
    }
}



