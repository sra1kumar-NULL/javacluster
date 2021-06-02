package collections;
import java.util.*;
public class Examination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		3
//		1 10 10
//		0 10
//		2 2 10
//		0 5
//		7 10
//		2 2 100
//		0 5
//		5 10
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
//		System.out.print(t);
		int n,k,f;
		int x=0;
		while(t>0) {
			n=sc.nextInt();
			k=sc.nextInt();
			f=sc.nextInt();
//			System.out.println(n);
//			System.out.println(k);
//			System.out.println(f);
			int temp3=0;
			int temp,temp2;
//			if(n==1) {
//				  temp=sc.nextInt();//0
//				  temp2=sc.nextInt();//10
//			
//				x=0;
//			}
//			
			for(int i=1;i<=n;i++) {
				 temp=0;
				 temp2=0;
				
				 temp=sc.nextInt();//0   7
				 temp2=sc.nextInt();//5   10
				
//				System.out.println(temp);
//				System.out.println(temp2);
				temp3=temp2;
				x=x+(temp3-temp);
				
		
			}
			
//			System.out.println(x);

			if(x>=k) {
					System.out.println("YES");
			}
			else {
					System.out.println("NO");
			}
				x=0;
				t--;
			
		}
	}

}
