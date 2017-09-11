
public class MatrixOperations 
{
	MatrixOperations(){}
	
	public Double[][] multiply(Double[][] A, Double[][]B)
	{
        int aRows = A.length;
        int aColumns = A[0].length;
        int bRows = B.length;
        int bColumns = B[0].length;

        if (aColumns != bRows) {
            throw new IllegalArgumentException("A:Rows: " + aColumns + " did not match B:Columns " + bRows + ".");
        }

        Double[][] C = new Double[aRows][bColumns];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                C[i][j] = 0.00000;
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
	
	public void print(Double[][] A)
	{
		for(int i=0; i<A.length; i++)
		{
			String row = "";
			
			for(int j=0; j<A[0].length; j++)
			{
				row += A[i][j] ;
			}
			System.out.println(row);
		}		
	}
}
