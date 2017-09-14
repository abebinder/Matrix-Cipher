
import java.util.*;
public class Main {

	
	public static double[][] getKeyFromUser(){
		MatrixMultiplications calculator = new MatrixMultiplications();
		Scanner s=new Scanner(System.in);
		System.out.println("Input first row of key matrix with spaces in between each entry");
		String r1=s.nextLine();
		System.out.println("Second Row");
		String r2=s.nextLine();
		System.out.println("Third Row");
		String r3=s.nextLine();
		return calculator.convertThreeStringsToKey(r1, r2, r3);
	}
	
	public static String getMessageFromUser(){
		Scanner s=new Scanner(System.in);
		System.out.println("What is the message?");
		String  answer=s.nextLine();
		return answer;
	}
	
	
	public static void main(String[] args) 
	{
		double[][]key=getKeyFromUser();
		MatrixMultiplications calculator = new MatrixMultiplications();
		//double[][] key ={{3,10,20},{20,9,17},{9,4,17}};
		//double[][] B = {{19, 0},{7, 0},{4, 0}};
		
		String message = getMessageFromUser();
		String encodedMessage = calculator.encode(message, key);
		System.out.println(encodedMessage);
		String decodedMessage = calculator.decode(encodedMessage, key);
		System.out.println(decodedMessage);

		
		//double[][] C = calculator.multiply(key, B);
		//System.out.println(calculator.modulo(207, 26));
		
		//calculator.print(C);
		
	}

}
