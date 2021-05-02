package dsa;

public class TwoDArray {

	public static void main(String[] args) {
		System.out.println("printing the diagonal matrix of 1 ' S");
		int [][] matrix = new int[3][3];
		for(int i=0 ; i<3;i++) {
			for(int j=0; j<3 ;j++) {
				if( i==j ){
					matrix[i][j]=1;
				}
				else
				{
					matrix[i][j]=0;
				}
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
