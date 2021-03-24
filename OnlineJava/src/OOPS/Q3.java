package OOPS;

public class Q3 extends BMW{

 static String model ="Q3";
 String world = "Shrilanka";
 public void getName1() {
		System.out.println(world);
		System.out.println("Name Of City: " +super.world);
 }

  Q3() {
	System.out.println("Q3 Constructor");
}
	public static void main(String[] args) {
	
		System.out.println("Model Is: " + model);
		System.out.println("Car Is: "+name);
		
		System.out.print("Behavior is:");
		//B.run();
	System.out.println("*********************************");
	BMW B = new BMW();
	Q3 q = new Q3();
	
	B.getname();
	q.getName1();


	}

}
