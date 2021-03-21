package ReverseString;

public class Demo {

	public static void main(String[] args) {
		
		//**************Approch 1****************
		  String str= "Hello";
		  
		  int length = str.length(); System.out.println(length);
		  
		  char[] Charr = str.toCharArray();
		  
		  System.out.println(Charr);
		  
		  for(int i=Charr.length-1; i>=0; i-- ) {
		  
		  System.out.print(Charr[i]); }
		 System.out.println();
		
		String str1 ="Vaibhav";
		
		int length1 = str1.length();
		
		char[] Charr1 = str1.toCharArray();
		
		for(int i=Charr1.length-1; i>=0; i--) {
			
			System.out.print(Charr1[i]);
		}
		System.out.println(); 
		
		//********Approch 2*********
		
		String Str3 = "Automation";
		
		Str3.length();
		
		char[] Charr3 = Str3.toCharArray();
		
		for(int i=Str3.length()-1; i>=0; i--) {
			System.err.print(Str3.charAt(i));
		}
		System.out.println();
		
		//********Approch 3*********
		StringBuffer SB = new StringBuffer(Str3);
		
		System.out.println(SB.reverse());
		
		//********Approch 4*********
		
		StringBuilder STRB= new StringBuilder(str);
		System.out.println(STRB.reverse());
		
		
		
		
		
		

	}

}
