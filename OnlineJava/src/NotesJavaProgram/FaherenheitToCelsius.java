package NotesJavaProgram;

import java.util.Scanner;

public class FaherenheitToCelsius {

	public static void main(String[] args) {
		
		float temprature;
		
		Scanner SC= new Scanner(System.in);
		
		System.out.println("Please Enter Temprature In Faherenheit");
		temprature= SC.nextInt();
	
		temprature =((temprature-32)*5)/9;
		System.out.println("Result Temprature in Celsius: "+temprature);
	}
}
