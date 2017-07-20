package Polilmorfizm;

public class Cw10 {
	void m1(){System.out.println("Metoda 1\nWywo³ujê drug¹ metodê: ");m2();}
	void m2(){System.out.println("Metoda 2");}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cw10 obiekt = new poch();
		obiekt.m1();

	}

}
class poch extends Cw10 {
	void m2(){System.out.println("Metoda 2 z klasy pochodnej");}
}



// w tym æwiczneiu rzutujê w górê obiekt klasy pochodnej i wywo³ujê metodê 2 z metody 1. Okazuje siê, ¿e wywo³a³a siê metoda z klasy pochodnej a nie bazowej.