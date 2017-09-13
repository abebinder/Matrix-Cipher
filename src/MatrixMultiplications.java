
public class MatrixMultiplications 
{
	MatrixMultiplications(){}

	public double modulo(double d, int m){
		while(d>=m){
			d=d-m;
		}
		return d;
	}
	
	public double charToDouble(char c){
		double d=Character.getNumericValue(c);
		return d-10;
	}
	public char doubleToChar(double d){
		d=d+97;
		int dAsinteger=(int)Math.round(d);
		char c=(char)dAsinteger;
		return c;
	}

	public String removeSpaces(String s){
		return s.replaceAll("\\s", "");	
	}

	public double[][] stringToDoubleArray (String s ){
		s=removeSpaces(s);
		int stringLengthDivided=s.length();
		if (stringLengthDivided%3==0){
			stringLengthDivided=stringLengthDivided/3;
		}
		else{
			stringLengthDivided=(stringLengthDivided/3)+1;
		}

		double[][]a =new double[3][stringLengthDivided];

		for(int i=0; i<stringLengthDivided; i++){
			for(int j=0; j<3; j++){
				int stringIndex=(i*3)+j;
				if(stringIndex<s.length()){
					char c=s.charAt((i*3)+j);
					double d=charToDouble(c);
					a[j][i]=d;
				}
				else{
					a[j][i]=charToDouble('a');
				}
			}
		}
		return a;
	}

	public double[][] multiply(double[][] A, double[][]B)
	{
		int aRows = A.length;
		int aColumns = A[0].length;
		int bRows = B.length;
		int bColumns = B[0].length;

		if (aColumns != bRows) {
			throw new IllegalArgumentException("A:Rows: " + aColumns + " did not match B:Columns " + bRows + ".");
		}

		double[][] C = new double[aRows][bColumns];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				C[i][j] = 0.0;
			}
		}

		for (int i = 0; i < aRows; i++) { // aRow
			for (int j = 0; j < bColumns; j++) { // bColumn
				for (int k = 0; k < aColumns; k++) { // aColumn
					C[i][j] += A[i][k] * B[k][j];
				}
			}
		}

		return C;
	}

	public void print(double[][] A)
	{
		for(int i=0; i<A.length; i++)
		{
			String row = "[";

			for(int j=0; j<A[0].length; j++)
			{
				row += A[i][j] + " " ;
			}
			System.out.println(row + "]");
		}		
	}
	public String encode(String s, double[][] key){
		double [][] message = stringToDoubleArray(s);
		double[][] encodedMessage = multiply(key, message);
		encodedMessage = modEntireArray(encodedMessage);
		String finalMessage = doubleArrayToString(encodedMessage);
		
		return finalMessage;
	}
	
	public String doubleArrayToString(double[][] message){
		String encodedMessage = ""; 
		for(int i=0; i<message[0].length; i++)
			for(int j=0; j<3; j++){
				
				encodedMessage += doubleToChar(message[j][i]);
			}
		return encodedMessage;
	}
	
	public double[][] modEntireArray(double[][] matrix){
		for(int i = 0; i<matrix.length; i++)
			for(int j=0; j<matrix[0].length; j++){
				matrix[i][j] = modulo(matrix[i][j], 26);
			}
		
		return matrix;
	}
	
	public String decode(String message, double[][] key){
		
		double[][] inverseKey = 
	}
}
