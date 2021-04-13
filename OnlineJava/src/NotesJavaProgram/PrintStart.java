package NotesJavaProgram;

public class PrintStart {
	public static void main(String[] args) {
		int row, NoOfStar;
		
		for(row =1; row<=10; row++) {
			
			for(NoOfStar =1; NoOfStar<=row; NoOfStar++) {
				
				System.out.print("*");
			}System.out.println();
		}
	}

}
