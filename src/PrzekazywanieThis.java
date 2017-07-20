
class Osoba {
	public void jedz(Jablko jablko){
		Jablko obrane = jablko.obierz();
		System.out.println("Pyszne");
	}
}
class Obieraczka {
	static Jablko obierz(Jablko jablko){
		return jablko;
	}
}
class Jablko {
	Jablko obierz() {return Obieraczka.obierz(this);
	}
}
public class PrzekazywanieThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Osoba().jedz(new Jablko());

	}

}
