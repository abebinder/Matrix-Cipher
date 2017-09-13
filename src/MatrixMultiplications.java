
public class MatrixMultiplications 
{
	MatrixMultiplications(){}

	public double charToDouble(char c){
		double d=Character.getNumericValue(c);
		return d-10;
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

		double[][]a =new double[stringLengthDivided][3];

		for(int i=0; i<stringLengthDivided; i++){
			for(int j=0; j<a[i].length; j++){
				int stringIndex=(i*3)+j;
				if(stringIndex<s.length()){
					char c=s.charAt((i*3)+j);
					double d=charToDouble(c);
					a[i][j]=d;
				}
				else{
					a[i][j]=charToDouble('a');
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

}
