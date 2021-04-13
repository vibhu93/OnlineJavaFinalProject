package NotesJavaProgram;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {

		passFail();
		checkcon();

	}
	
	public static void checkcon() {
		boolean learning = true;

		if (learning) {
			System.out.println("welcome to vaibhav Program coaching ");

		} 
		else {
			System.out.println("What Are you doing here");

		}
	}
	
	public static void passFail() {
		
		double obtainmarks, passingMarks;
		
		passingMarks =40;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter Obtain Marks");
		obtainmarks= sc.nextInt();
		
		if (obtainmarks>=passingMarks) {
			System.out.println("Your Passed Bro");
			
		} else {
			System.out.println("Sorry!! Your Not qualify for next round");

		}System.out.println("*************");
		
	}

}
