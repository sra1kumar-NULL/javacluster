package collections;

import java.util.Scanner;

//Sample Input:
//3
//1 1 0
//1 3 1
//2 2 3
//Sample Output:
//1
//2
//4
public class LazyChef {
	public static void main(String[] args) {
		Scanner sc=new  Scanner(System.in);
		int t=sc.nextInt();
		int x;
		int m;
		int d;
		for(int i=0;i<t;i++) {
			x=sc.nextInt();
			m=sc.nextInt();
			d=sc.nextInt();
			if(x*m<=x+d) {
				System.out.println(x*m);
			}
			else {
				System.out.println(x+d);
			}
		}
//		while(t>0) {
//			int[] val=(int)sc.nextLine().split(" ");
//		}
	}
}
