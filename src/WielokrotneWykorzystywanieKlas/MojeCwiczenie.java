package WielokrotneWykorzystywanieKlas;
class GI{
	private String imie, nazwisko;
	private int numer;
	private enum STOPIEN{SZEREGOWY, KAPRAL, PLUTONOWY, SIER¯ANT, CHOR¥¯Y, PORUCZNIK, KAPITAN, MAJOR};
	protected boolean zrekrutuj(String imie, String nazwisko, int numer){
		this.imie=imie;
		this.nazwisko=nazwisko;
//		this.STOPIEN=stopien;
		this.numer=numer;
		P.p("Nowy rekrut: "+numer+" "+imie+" "+nazwisko+" "+STOPIEN.SZEREGOWY);
		return true;
	}
	public String toString(){return Integer.toString(numer);}
}
class Oficer extends GI{
	private double pensja;
	private int staz;
	public void urlopuj(int numer){P.p("Oficera wys³ano na urlop");}
}
public class MojeCwiczenie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GI Jane = new GI();
		if(Jane.zrekrutuj("Jane","Ireland",0001)) P.p("OK");
		Oficer Parker = new Oficer();
		Parker.zrekrutuj("John", "Parker", 2);
	}

}
