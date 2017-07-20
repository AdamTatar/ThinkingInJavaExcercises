package WielokrotneWykorzystywanieKlas;

public class JedenPochodna extends JedenNadrzedna {

	String tekst2 = "Tekst klasy pochodnej";
	int liczba2 = 7897809;
	
	public void metoda(){
		int c = 151515;
		System.out.println("Metoda klasy pochodnej");
		super.metoda(1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Cia³o main klasy pochodnej");
		JedenPochodna obiektPochodny = new JedenPochodna();
		obiektPochodny.metoda();
		//super.metoda();		
		JedenNadrzedna obiekt2 = new JedenNadrzedna();
		obiekt2.metoda();
		//super.metoda();					// nie mogê u¿yæ bo statyczny kontekst - dlaczego?
		//int nowa_liczba = obiekt2.liczba;
		//System.out.println("Nowa liczba wynosi: "+nowa_liczba);				// to tutaj wszystko jest niewidoczne bo jest private
		//obiekt2.metodaPrywatna();
		//System.out.println("Napis z klasy nadrzednej = "+obiekt1.tekst);
		System.out.println(obiekt2.toString());


	}

}
