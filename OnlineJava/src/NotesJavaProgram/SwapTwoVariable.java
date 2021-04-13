package NotesJavaProgram;

import java.util.Scanner;

public class SwapTwoVariable {

	public static void main(String[] args) {

		//Swaping3VaribelByScanner();
		//Swaping3VaribelByNormal();
		swapingtwovariable();

	}

	public static void Swaping3VaribelByScanner() {
		// Swaping with Initialization
		int x, y, temp;

		System.out.println("Please Enter X and Y Values");

		Scanner S = new Scanner(System.in);

		x = S.nextInt();
		y = S.nextInt();

		System.out.println("Before Swaping Variable: \nx: = " + x + "\ny: = " + y);

		temp = x;
		x = y;
		y = temp;

		System.out.println("After Swaping Varibales: \nX: =" + x + "\nY: =" + y);

	}

	public static void Swaping3VaribelByNormal() {
		System.out.println("***By Normal Method***");

		// Swaping By Normal Method
		int A = 10;
		int B = 30;
		int temp1;

		System.out.println("Before Swaping Variable: \nx: = " + A + "\ny: = " + B);

		temp1 = A;
		A = B;
		B = temp1;

		System.out.println("After Swaping Varibales: \nX: =" + A + "\nY: =" + B);

	}
	
	public static void swapingtwovariable() {
		
		//without using thrid varibale
		
		int c=10;
		int d=50;
		
		System.out.println("Before Swaping: \nc: ="+c+"\nd: ="+d );
		c=c+d;//60
		d=c-d;//60-50 =10
		c=c-d;//60-10 =50
		
		System.out.println("After Swaping Variable: \nc: = " +c+"\nd: = "+d);
	
		
	}

}
