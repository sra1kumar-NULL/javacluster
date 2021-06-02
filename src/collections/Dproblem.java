package collections;
import java.util.*;
public class Dproblem {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int m= sc.nextInt();
		int p= sc.nextInt();
		for(int j=0;j<n;j++) {
			int[][] arr=new int[n][m];
			for(int i=0;i<m;i++) {
				arr[j][i]=sc.nextInt();
				System.out.println(arr[j][i]+" ");
			}
			System.out.println("\n");
		}
	}
}
