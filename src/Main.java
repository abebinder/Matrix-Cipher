public class Main {

	public static void main(String[] args) 
	{
		MatrixMultiplications calculator = new MatrixMultiplications();
		int[][] A = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] B = {{2,4,6},{1,3,5},{1,5,7}};
		
		int[][] C = calculator.multiply(A, B);
		
		calculator.print(A);
		System.out.println();
		calculator.print(B);
		System.out.println();
		calculator.print(C);
	}

}
