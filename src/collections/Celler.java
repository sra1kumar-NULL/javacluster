package collections;
import java.math.BigInteger;
import java.util.*;
public class Celler {
	public static int[] main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
//		4
//		11 3
//		01000000001
//		10 2
//		0110100101
//		5 2
//		10101
//		3 100
//		000
		int t=sc.nextInt();
		while(t>0) {
			int n,m;
			n=sc.nextInt();
			m=sc.nextInt();
//			int[] arr=new int[n];
//			for(int i=0;i<n;i++) {
			
			
//			}
//			System.out.println(arr);
//		    BigInteger arr=new BigInteger();
//		    arr=sc.nextLong();
			int[] Int_to_array(int n1) 
			{ 
				int j = 0; 
				int len = Integer.toString(n1).length(); 
				int[] arr = new int[len]; 
				while(n1!=0) 
				{ 
					arr[len-j-1] = n1%10; 
					n1=n1/10; 
					j++; 
				} 
				return arr; 
			}
		   int ll=sc.nextInt();
		   int[] arr=Int_to_array(ll);
			while(m>0) {
				int count=0;
				for(int j=0;j<n1;j++) {
					if(arr[j+1]==1|| arr[j-1]==1) {
						arr[j]=1;
						if(arr[j]==0) {
							count++;
						}
					}
					if(arr.length==count) {
						System.out.println(arr);
					}
				}
				m--;
			}
			System.out.println(arr);
			t--;
		}
		sc.close();
	}

	private static int[] Int_to_array(int ll) {
		// TODO Auto-generated method stub
		return null;
	}
}
