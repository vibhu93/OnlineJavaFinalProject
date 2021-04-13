package NotesJavaProgram;

import java.util.Scanner;

public class WhileLoopTest {
	
	public static void main(String[] args) {
	
		whilemethod();
		
	}
	
	public static void whilemethod() {
	int x;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter Integer Value");
		
		while((x=sc.nextInt())!=0) {
			
			System.err.println("You Enter Vlaue IS: "+x);
			
		}System.out.println("Out Of While loop");
	}

}
