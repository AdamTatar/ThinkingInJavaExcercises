package WielokrotneWykorzystywanieKlas;

class Zaba extends Plaz{
	public void nadepnij(Plaz plaz){System.out.println("Rozdeptano p³aza "+nazwa());} //tu dopisana metoda przes³oni³a tê z klasy nadrzêdnej	
}


public class Plaz {

	private int wielkosc;
	private String nazwa;
	public void nazwijPlaza(String nazwa){this.nazwa=nazwa;}
	public void nadepnij(Plaz plaz){System.out.println("Rozdeptano "+plaz.nazwa);}
	public String nazwa(){return this.nazwa;}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zaba zaba = new Zaba();
//		System.out.println(zaba.nazwa());
		zaba.nazwijPlaza("¯abka");
		System.out.println(zaba.nazwa());
		zaba.nadepnij(zaba);
	}

}
