package NotesJavaProgram;

import java.util.Scanner;

public class WhileLoop {
public static void main(String[] args) {
	//whileLoop();
	//floatValuewhile();
}
	public static void whileLoop() {
		
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input an Integer");
		
		 while((n =sc.nextInt())!=0) {
			 System.err.println("You Enter: " +n );
		 }System.out.println("Out of loop");
		
	}
	
	public static void floatValuewhile() {
		
		double x;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please Enter Float Value");
		
		while((x=input.nextDouble())!= 0) {
			System.out.println("You Enter Second Value: "+ x);
		}System.out.println("Out of loop");
	}
}
