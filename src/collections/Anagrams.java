
package collections;
import java.util.*;
import java.io.*;

public class Anagrams {
	public static void main(String[] args) {
		Map<Character ,Integer> map=new HashMap<Character,Integer>();
		Map<Character ,Integer> mar=new HashMap<Character,Integer>();
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		try {
			String str1=br.readLine().toLowerCase();
			String str2=br.readLine().toLowerCase();
			
			for(int i=0;i<str1.length();i++) {
				char letter=str1.charAt(i);
				if(!map.containsKey(letter)) {
					map.put(letter, 1);
				}
				else {
					Integer freq = map.get(letter);
					map.put(letter, ++freq);
					
				}
			}
			for(int i=0;i<str2.length();i++) {
				char letter=str2.charAt(i);
				if(!mar.containsKey(letter)) {
					mar.put(letter, 1);
				}
				else {
					Integer freq = mar.get(letter);
					mar.put(letter, ++freq);
					
				}
			}
			if(str1.length()!=str2.length()){
				System.out.println("Not Anagrams");
			}
			else if(map.equals(mar)) {
				System.out.println("Anagrams");
			}
			else {
				System.out.println("Not Anagrams");
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}
}
