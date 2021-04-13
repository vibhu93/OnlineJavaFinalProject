package NotesJavaProgram;

import java.util.Scanner;

public class SecondIfElse {

	public static void main(String[] args) {
		gradSystem();
	}
	static char grade;
	public static void gradSystem() {
		float ObtainMarks, PassingMarks;

	
		PassingMarks=45;

		System.out.println("Please Enter Your ObtainMarks");

		Scanner sc = new Scanner(System.in);
		ObtainMarks = sc.nextFloat();

		if(ObtainMarks>=PassingMarks) {
			
			if(ObtainMarks>90)
				grade ='A';
		
			
			else if(ObtainMarks>75)
				grade='B';
		
			
			else if(ObtainMarks> 60)
				grade='C';
		
			
			else 
				grade ='D';
			
			System.out.println("As per Obtain Marks Your Grade is: "+grade);
			
		}else {
			System.out.println("Your Passed At Boundery Level");
			
		}



	}
}
