// DZIEDZICZENIE podstawowe �wiczenia
package WielokrotneWykorzystywanieKlas;

public class JedenNadrzedna {
	public static void p(Object obj){System.out.println(obj);}
	private String tekst = "Tekst z klasy nadrzednej";
	private int liczba = 67523;
	public void metoda(){
		System.out.println("Wywo�ano metod� klasy nadrz�dnej");
	}
	public void metoda(int i){
		System.out.println("Wywo�ano metod� klasy nadrz�dnej z parametrem i = "+i);
	}
	private void metodaPrywatna(){
		System.out.println("Metoda prywatna klasy nadrzednej");
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Cia�o main klasy nadrzednej");
		JedenNadrzedna obiekt1 = new JedenNadrzedna();
		obiekt1.metoda();
		int nowa_liczba = obiekt1.liczba;
		System.out.println("Nowa liczba wynosi: "+nowa_liczba);
		obiekt1.metodaPrywatna();
		p("Napis z klasy nadrzednej = "+obiekt1.tekst);
		DodTe.main(null);

			}

}

class DodTe{
	private String t = "Spodnie ";		//Dlaczego tutaj musi by� statyczny ten string, w przyk�adach nie jest i dzia�a - trzeba doda� metod� toString() i zwr�ci� t
	public void dodaj(String a){t+=a;}
	public void M65(){dodaj("M65 ");}
	public void BDU(){dodaj("BDU ");}
	public void ACU(){dodaj("ACU ");}
	public void SFU(){dodaj("SFU ");}
	public void Multicam(){dodaj("Multicam ");}
	public void Bundeswehr(){dodaj("Bundeswehr ");}
	public String toString(){return t;}
	
	public static void main(String[] args){
		DodTe x = new DodTe();
		x.M65();
		x.BDU();
		x.Bundeswehr();
		x.ACU();
		x.Multicam();
		JedenNadrzedna.p(x);

	}
	
}