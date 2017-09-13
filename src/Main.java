public class Main {

	public static void main(String[] args) 
	{
		MatrixMultiplications calculator = new MatrixMultiplications();
		Inverse inverseCalc = new Inverse();
		double[][] key ={{3,10,20},{20,9,17},{9,4,17}};
		double[][] B = {{19, 0},{7, 0},{4, 0}};
		
		String message = "theroostercrowsatdawn";
		String encodedMessage = calculator.encode(message, key);
		System.out.println(encodedMessage);
		//double[][] C = calculator.multiply(key, B);
		//System.out.println(calculator.modulo(207, 26));
		
		//calculator.print(C);
		
	}

}
