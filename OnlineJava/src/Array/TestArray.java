package Array;

public class TestArray {

	

	
	public static void main(String[] args) {
		
		//One way to define values to array
		//Initilize Array
		int a [] = new int [10];
		
		//Define array
		a [0] =11;
		a [1] =22;
		a [2] =33;
		a [3] =44;
		a [4] =55;
		a [5] =66;
		a [6] =77;
		a [7] =88;
		a [8] =99;
		
		
		//System.out.println(a[5]);
		
		for(int i=0; i<a.length; i++) {
			
			System.out.println(a[i]);
		}
		
		
		//Second way to define value to array
		
		double SecondArray [] = {10,20,30,40,50,80,90};
		
		 int ThirdArray[] = {1,2,3,4,5,6,7,8};
	}
}
