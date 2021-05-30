package collections;

import java.util.ArrayList;
import java.util.List;
//public class SubStringCompare {
//
//	
//}
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class SubStringCompare {

    public static String getSmallestAndLargest(String s, int k) {
       
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        String Str=s;
        String smallest = s.substring(0,k);
        String largest =s.substring(0,k);
        int l=k;
        List<String> sets=new ArrayList<String>();
        for(int i=0;i<Str.length()-l+1;i++) {
        	 String sTemp = s.substring(i, i + k);
        	  if(sTemp.compareTo(smallest) < 0) {
                  smallest = sTemp;
              }
                 
              if(sTemp.compareTo(largest) > 0) {
                  largest = sTemp;
              } 
        }
      
        return smallest + "\n" + largest;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//      Sample Input 0
  //
//      welcometojava
//      3
//      Sample Output 0
  //
//      ava
//      wel
      String s=sc.nextLine();
      int k=sc.nextInt();
      
      System.out.println(SubStringCompare.getSmallestAndLargest(s,k));
      sc.close();
      
    }
}

