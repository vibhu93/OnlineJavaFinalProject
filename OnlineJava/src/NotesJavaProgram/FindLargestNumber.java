package NotesJavaProgram;

import java.util.Scanner;

public class FindLargestNumber {

public static void main(String[] args) {
	largeNo();
}
	public static void largeNo() {
		 int x, y, z;

		Scanner sc = new Scanner(System.in);

		System.out.println("Please Enter First Number");
		x= sc.nextInt();
		
		System.out.println("Please Enter Second Number");
		y = sc.nextInt();
		
		System.out.println("Please Enter Third Number");
		z= sc.nextInt();
		
		if(x > y && x > z) {
			System.out.println("1st is large No.");
		}
		else if(y>z && y>x) {
			System.out.println("2nd is larger No.");
		}
		else if(z>x && z>y) {
			System.out.println("3rd is large No.");
		}
		else {
			System.out.println("Please Enter distict Number");
		}
	}
}
