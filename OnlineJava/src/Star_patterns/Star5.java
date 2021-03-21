package Star_patterns;

public class Star5 {

	public static void main(String[] args) {
	
		/*
		 * for(int i=1; i<=4; i++) {
		 * 
		 * for(int j=3; j>=i; j--) {
		 * 
		 * System.out.print(" "); } for (int R=1; R<=i; R++) { System.out.print("*"); }
		 * System.out.println(); } for(int s=1; s<=3; s++) {
		 * 
		 * for(int d=1; d<=s; d++ ) {
		 * 
		 * System.out.print(" "); } for(int p=3; p>=s; p--) {
		 * 
		 * System.out.print("*"); }System.out.println();
		 * 
		 * }
		 */
		
		for(int i=1; i<=4; i++) {
			
			for(int j=1; j<=i; j++) {
				System.out.print("");
			}
			for(int R=4; R>=i; R--) {
				System.out.print("*");
				
			}
			System.out.println();
		}

	}
	
	

}
