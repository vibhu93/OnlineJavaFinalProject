package OOPS;

public class CalculateInstrest {

	public static void main(String[] args) {
		
		IndianBanks I = new IndianBanks();
		AmericaBanks A = new AmericaBanks();
		PakisstandBanks P = new PakisstandBanks();
		
		System.out.println("Indian Bank Instrest Is: "+ I.getinstrest());
		System.out.println("American Bank Instrest Is: "+ A.getinstrest());
		System.out.println("Pakisstand Bank Instrest Is: "+ P.getinstrest());

	}

}
