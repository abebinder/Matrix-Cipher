public class Main {

	public static void main(String[] args) 
	{
		MatrixMultiplications calculator = new MatrixMultiplications();
		Inverse inverseCalc = new Inverse();
		double[][] A = {{1,2,3},{4,5,6},{7,8,9}};
		double[][] B = {{2,4,6},{1,3,5},{1,5,7}};
		
		double[][] C = calculator.multiply(A, B);
		
		/*calculator.print(A);
		System.out.println();
		calculator.print(B);
		System.out.println();
		calculator.print(C);
		double[][] D = inverseCalc.invert(B);
		calculator.print(D);
		System.out.println(calculator.charToDouble('a'));
		*/
		double d=0;
		System.out.println(calculator.doubleToChar(d));
		String test="abcdefg";
		calculator.stringToDoubleArray(test);
	}

}
