package InterviewQuestion;

public class IntegerException {

	public static void main(String[] args) {
	
		try{
			System.out.println(1/0);
		}catch (Exception e) {
			System.out.println("Exception");
		}
		System.out.println(1.2/0);
		System.out.println(1.2563/0);
		System.out.println(4562.0D/0.0);
		System.out.println(123.2f/0);
		System.out.println(0/0.0);
		System.out.println(0.0/0.0);
		System.out.println(0.0/0);
		System.out.println(12.2/0.0);

	}

}
