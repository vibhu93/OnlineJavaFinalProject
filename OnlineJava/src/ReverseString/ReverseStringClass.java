package ReverseString;

public class ReverseStringClass {

	static String str= "Vaibhav";
	static String str1 = "Nikhil";
	static String str2= "Sumit";
	static String str3= "Neha";
	
	public static void FirstMedthos() {
		// First Approch to Reverse Strings
		int length = str.length();
		System.out.println(length);
		char[] charr = str.toCharArray();
		for(int i=charr.length-1; i>=0; i--) {
			
			System.out.print(charr[i]);
		}
		System.out.println();
	}
	
	public static void SecondMethod() {
		
		//Second Approch to rever the string
		char[] chrr1 = str1.toCharArray();
		for(int n=str1.length()-1; n>=0; n--) {
			System.out.print(str1.charAt(n));
			
		}
		System.out.println();
		
		
	}
	
	public static void ThridMethod() {
		
		StringBuilder SB = new StringBuilder(str2);
		System.out.println(SB.reverse());
		
	}
	
	public static void FourMethod() {
		
		StringBuffer SB2 = new StringBuffer(str3);
		System.out.println(SB2.reverse());
	}
	
	
	
	
	public static void main(String[] args) {
		FirstMedthos();
		SecondMethod();
		ThridMethod();
		FourMethod();
	}
		
		
	
	
}
