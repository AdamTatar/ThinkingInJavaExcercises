package pakietDef;


class Nowa extends Abstrakcyjna{
	{System.out.println("Napis z nawiasów klamrowych klasy Nowa");}

	Nowa(){
		System.out.println("Konstruktor Nowa");
	}
	private String napis = "Mój napis z klasy Nowa";

	public String getNapis() {
		return napis;
	}

	public void setNapis(String napis) {
		this.napis = napis;
	}

	@Override
	public void metodaA() {
		// TODO Auto-generated method stub
		System.out.println("Metoda A -> musiała zostać zaimplementowana, bo w klasie abstrakcyjnej została oznaczona jako abstract");
		
	}
	
}



public class Mejn {

	public static void main(String[] args) {

		System.out.println("Hello World!");
		System.out.println("Wyświetlam liczby od 21 do 100:");
		for(int i = 21; i <=100;i++){
			System.out.print(i+" ");
			if(i%20==0) System.out.println("");
		}
	
		Nowa nowy = new Nowa();
		System.out.println(nowy.getNapis());
		nowy.metodaB();
		nowy.metodaA();
	}
	

}














