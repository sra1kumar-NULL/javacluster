package collections;
import java.util.*;
//3
//1 aN
//2 ab NO
//3 A N D
//Example Output
//NO
//YES
//NO
public class CorrectSentence {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String lang1="abcdefghijklm";
		String lang2="NOPQRSTUVWXYZ";
		int t=sc.nextInt();
		int n;
		int x=0;
		for(int i=0;i<t;i++) {
			n=sc.nextInt();
			for(int j=1;j<=n;j++) {
				String str=sc.next();
				for(char ch:str.toCharArray()) {
					if(!(lang1.contains(Character.toString(ch))||lang2.contains(Character.toString(ch)))){
						x=-1;
					}
					else {
						x=0;
					}
				}
			
			}
			if(x==-1) {
				System.out.println("NO");
			}
			else {
				System.out.println("YES");
			}

		}
	}
}
