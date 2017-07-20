
public class CzyPrywatna {
	CzyPrywatna(){
		System.out.println("Konstruktor klasy CzyPrywatna");
	}
	private void metoda1(){
		System.out.println("Prywatna metoda 1");
	}
	public int metoda2(){
		return(1226);
	}
	protected void metoda3(){
		System.out.println("Chroniona metoda 3");
	}
	String metoda4(int a){
		return(a==3 ? "Trzy" : "Dupa"); 
	}

}
