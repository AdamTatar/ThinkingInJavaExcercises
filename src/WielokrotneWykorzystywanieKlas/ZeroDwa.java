package WielokrotneWykorzystywanieKlas;

public class ZeroDwa {
	private ZeroJeden mojePole;
	
	ZeroJeden zj = new ZeroJeden();			//przypomnie� sobie dlaczego tylko inicjalizacja w imejscu definicji wywo�uje konstruktor ??2
	
	public String toString(){
		mojePole = new ZeroJeden();
		System.out.println("Metoda toString");
		return "Metoda toString zwraca mojePole = " + mojePole;
	}

}
