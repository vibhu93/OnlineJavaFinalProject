package NotesJavaProgram;

import java.util.Scanner;

public class compareString {

	public static void main(String[] args) {
		String a, b;

		Scanner sc = new Scanner(System.in);

		System.out.println("Please Enter Your First String");

		a= sc.next();

		System.out.println("Please Enter Your Second String");

		b= sc.next();

		if(a.compareTo(b)>0) {

			System.out.println("Your First String is grater than second");

		}
		else if(a.compareTo(b)<0) {	
			System.out.println("Your Second String is grater than First");
		}
		else if(a.compareTo(b)>=0) {
			System.out.println("Both Are Equal size");
		}

		else {
			System.out.println("Nothing to print");
		}
	}


}
