package Polilmorfizm;

public class Gryzonie {

	private String imie;
	private int rozmiar;
	public void jedz(){System.out.println("Je");}
	public void spij(){System.out.println("Spi");}
	
	
	public static void main(String[] args) {								//tu stworzy³em tablicê gryzoni i wywo³a³em dla nich metody z klasy bazowej, 
		// TODO Auto-generated method stub									//ale okazuje siê ¿e metody z klas pochodnych przes³oni³y metody z bazowej
		Gryzonie[] gryzonie = {new Mysz(), new Chomik()};
		
		for(Gryzonie g : gryzonie){
			g.jedz();
			g.spij();
		}
		
		/*gryzonie[0].jedz();
		gryzonie[1].jedz();
		gryzonie[0].spij();
		gryzonie[1].spij();
*/
	}

}
class Mysz extends Gryzonie {
	private static final int DLUGOSC_OGONA = 7;
	private String imie;
	private int rozmiar;
	public void jedz(){System.out.println("MYSZ Je");}
	public void spij(){System.out.println("MYSZ Spi");}
	
	
	
	
}

class Chomik extends Gryzonie {
	private static final int POJEMNOSC_PASZCZY = 10;
	private String imie;
	private int rozmiar;
	public void jedz(){System.out.println("CHOMIK Je");}
	public void spij(){System.out.println("CHOMIK Spi");}
	
}