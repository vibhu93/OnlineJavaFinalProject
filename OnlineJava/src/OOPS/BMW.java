package OOPS;

public class BMW extends Car{

	 static String name ="BMW";
	
	 String world = "America";
	 
	 public void getname() {
		 System.out.println(world);
		 System.out.println(super.world);
	 }
	 
	 BMW(){
		 System.out.println("BMW Constructor");
	 }
	public static void main(String[] args) {
		
		Car c = new Car();
		System.out.print(name);
		c.run();
	}
}
