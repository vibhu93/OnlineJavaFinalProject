package Array;

public class UsedArrayInMethod {

	public static void findMin(int ThirdArray[]) {
		
		int Min = ThirdArray[0];
		
		for(int i=1; i<ThirdArray.length; i++) {
			
			if(Min>ThirdArray[i]) {
				
				Min=ThirdArray[i];
			}
			
		}System.out.println("Min Array is: " + Min);
	}
	public static void main(String[] args) {
		UsedArrayInMethod u = new UsedArrayInMethod();
		
		int ArrayTest[]= {10,20,30,40,5,60};
		
		u.findMin(ArrayTest);
	}
	

}
