package NotesJavaProgram;

import java.math.BigInteger;
import java.util.Scanner;

public class AdditonOfLargeNO {

	public static void main(String[] args) {
		
		String number1, number2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Num 1");
		number1=sc.nextLine();
		
		System.out.println("Please Num 2");
		number2=sc.nextLine();
		
		BigInteger first = new BigInteger(number1);
		BigInteger second = new BigInteger(number2);
		
		BigInteger sum;
		
		sum = first.add(second);
		
		System.out.println("Large Value Is: = "+sum);




	}

}
