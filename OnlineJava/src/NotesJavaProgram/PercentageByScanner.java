package NotesJavaProgram;

import java.util.Scanner;

public class PercentageByScanner {
	
	public static void main(String[] args) {
	
		double Percentage =100;
		
		
		Scanner S = new Scanner(System.in);
		System.out.println("Please Enter Your Marks Obtains out of 600");
		Percentage = S.nextInt();
		
		Percentage = ((Percentage/600)*100);
		
		System.out.println("Your Total Persentage Is: "+Percentage);
	}

}
