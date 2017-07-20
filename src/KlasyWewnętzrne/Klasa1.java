package KlasyWewnêtzrne;

public class Klasa1 {
	
	Klasa1(){System.out.println("Konstruktor Klasa1 z którego wywo³ujê string wewS");Wew wew = new Wew(); System.out.println(wew.wewS);}

	private String zew = "Napis klasy ZEWNETRZNEJ";
	
	class Wew {
		Wew() {System.out.println("Konstruktor klasy wewnêtrznej");}
		private String wewS = "String klasy wewnêtrznej";
		String toString(String s){return wewS;}
		void napisz(){System.out.println("metdoa napisz klasy wewnêtrznej");}
		String dostep(){return(zew);}
	}
	
	Wew zwroc(){return new Wew();}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Klasa1 zew = new Klasa1();
		//Wew wewnetrzna = Klasa1.new Wew();
		Wew wew = zew.new Wew(); 
		System.out.println(wew.dostep());
		wew.napisz();
		System.out.println(wew.toString());
		System.out.println(wew.toString("Dupa"));
		zew.zwroc();

	}

}
