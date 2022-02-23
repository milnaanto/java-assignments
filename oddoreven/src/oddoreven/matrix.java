package oddoreven;

public class matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[][] = {{8,6},{3,4}};
int b[][] = {{1,2},{7,9}};
int c[][] = new int[2][2];

 for(int i = 0; i <2; i++) {
	 for (int j = 0; j<2; j++) {
		 c[i][j] = a[i][j] + b[i][j] ;
		 System.out.print(c[i][j] + " ");
	 }
		 System.out.println();
		 
	 
 }
	}

}
