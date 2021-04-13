package NotesJavaProgram;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		
		int a; float b;
		
		System.out.println("Hey..! Welcome to vaibhav Banks.....");
		Scanner Sc =new Scanner(System.in);
	
		System.out.println("Please Enter Your Password");
		
		a= Sc.nextInt();
		
		System.out.println("Please Enter Reconfirm your password");
		b = Sc.nextInt();
		
		if(a==b){
			System.out.println("Successfully enter in bank");
			
		}else
		{
			System.out.println("Please Enter correct password");
		}
		
	

	}

}
