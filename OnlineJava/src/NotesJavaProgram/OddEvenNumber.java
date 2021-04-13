package NotesJavaProgram;

import java.util.Scanner;

public class OddEvenNumber {
	
	public static void main(String[] args) {
		 int x;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter your Number");
		x=sc.nextInt();
		
		if (x % 2==0) {
			
			System.out.println("Number is Even");
			
		}else {
			System.out.println("Number is odd");
		}
	
	
	}

}
