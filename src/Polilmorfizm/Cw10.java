package Polilmorfizm;

public class Cw10 {
	void m1(){System.out.println("Metoda 1\nWywo�uj� drug� metod�: ");m2();}
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



// w tym �wiczneiu rzutuj� w g�r� obiekt klasy pochodnej i wywo�uj� metod� 2 z metody 1. Okazuje si�, �e wywo�a�a si� metoda z klasy pochodnej a nie bazowej.