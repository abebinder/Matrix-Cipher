
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
		Scanner s=new Scanner(System.in);
		while(true){
			System.out.println("Welcomme Abe and Robbie's Dank Matrix Cryptography Program");
			System.out.println("Press 1, enter to encode a dank message. Press 2, enter to decode a dank encoded message");
			String option=s.nextLine();
			double[][]key=getKeyFromUser();
			MatrixMultiplications calculator = new MatrixMultiplications();
			//double[][] key ={{3,10,20},{20,9,17},{9,4,17}};
			//double[][] B = {{19, 0},{7, 0},{4, 0}};
			String message = getMessageFromUser();
			if(option.equals("1")){
				String encodedMessage = calculator.encode(message, key);
				System.out.println("");
				System.out.println("Encoded Message");
				System.out.println(encodedMessage);
				System.out.println("");
			}
			if(option.equals("2")){
				String decodedMessage = calculator.decode(message, key);
				System.out.println("");
				System.out.println("Decoded Message:");
				System.out.println(decodedMessage);
				System.out.println("");
			}
		}

	}

}
