package collections;
import java.util.*;
public class UltimateQuiz {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		3
//		1 1 1
//		1
//		1 1 2
//		1 1
//		5 5 10
//		2 5 2 5 2 4 10 10 10 10
//		Example Output
//		0
//		1 1
//		2 2 5
		int n,m,k;
		int t=sc.nextInt();
		for(int i=0;i<t;i++) {
			n=sc.nextInt();
			m=sc.nextInt();
			k=sc.nextInt();
			int[] ls = new int[k];
			for(int j=0;j<k;j++){
				
				ls[j]=sc.nextInt();
			}
			int userSindex=1;
			int userEindex=n;
			int adminSindex=n+1;
			int adminEindex=n+m;
			int x;
			int freq=0;
			Map<Integer,Integer> map =new HashMap<Integer,Integer>();
			if(n==1&&m==1&&k==1) {
				x=0;
			}
			
			else {
				for(int item:ls) {
					if(map.containsKey(item)) {
						map.put(item, ++freq);
					}
					else {
						
						map.put(item,freq);
					}
				}
//				System.out.println(map);
				for(int val:map.values()) {
					if(val>1) {
						
					}
				}
			}
			
		}
	}
}
