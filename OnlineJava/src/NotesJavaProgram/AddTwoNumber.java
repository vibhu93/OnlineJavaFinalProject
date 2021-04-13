package NotesJavaProgram;

import java.util.Scanner;

public class AddTwoNumber {
	static Scanner SC  = new Scanner(System.in);
	public static void main(String[] args) {

		Addition2Number();
		NormalAddtion();
		mutiplication();
		SCBy3Mutiplication();
	}
	
	public static void Addition2Number() {

		int x, y, z;
		int a = 100;

		SC = new Scanner(System.in);
		System.out.println("Please Enter X Value");
		x = SC.nextInt();
		System.out.println("Please Enter Y Value");
		y = SC.nextInt();

		z = x + y;

		System.out.println("Addition Of Two Number: \nZ:= " + z);

	}

	public static void NormalAddtion() {
		//By Normal Method
		int x=10; int y=20; int z;

		z= x+y;

		System.out.println("Addtion By NormalMethod\nZ:= "+z);

	}

	public static void mutiplication() {

		//Normal Method

		int A=10; int B=20; int C;


		C=A*B;

		System.out.println("Multiplication Of Two Mumber Is: \nC:= "+C);

	}

	public static void SCBy3Mutiplication() {
		int P, Q, R, S;
		
		System.out.println("Enter Value of P");
		P=SC.nextInt();
		
		System.out.println("Enter Value of Q");
		Q= SC.nextInt();
		
		System.out.println("Enter Value of R");
		R=SC.nextInt();
		
		S=P*Q*R;
		
		System.out.println("Multiplication Of All: \nS: = "+ S);


	}

}
