package collections;
//
//public class SubStringer {
//
//	
//}
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SubStringer {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
//        Sample Input
//
//        Helloworld
//        3 7
//        Sample Output
//
//        lowo
        System.out.println(S.substring(start, end));
    }
}
