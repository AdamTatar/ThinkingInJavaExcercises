import java.util.Arrays;

class Obiekt {
	Obiekt(String nazwa, int numer) {
		setNazwa(nazwa);
		setNumer(numer);
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public int getNumer() {
		return numer;
	}

	public void setNumer(int numer) {
		this.numer = numer;
	}

	private String nazwa;
	private int numer;

	public String toString() {
		return ("Obiekt o nazwie " + getNazwa() + " i numerze " + getNumer());
	}
}


class StaticTest{
	static int ii = 69;
}
class StaticFun{
	static void incr(){
		StaticTest.ii++;
	}
}



public class Tablice {

	public static void wypiszObiekty(Obiekt[] tablica) {
		System.out.println("Wypisujê tablicê obiektów:\n" + Arrays.toString(tablica));
	}

	public static Integer[] wypelnij(int ileElementow) {
		Integer[] result = new Integer[ileElementow];
		Arrays.fill(result, ileElementow);
		return result;
	}

	public static Integer[] laczenieTablic(Integer[] tab1, Integer[] tab2) {
		Integer[] result = new Integer[tab1.length + tab2.length];
		System.arraycopy(tab1, 0, result, 0, tab1.length);
		System.arraycopy(tab2, 0, result, tab1.length, tab2.length);
		return result;
	}

	public static void elsIf(){
		int z = 0;
		do{
			if(z==0) System.out.print("zero, ");
			else if(z==1) System.out.print("jeden, ");
			else if(z==2) System.out.print("dwa, ");
			else if(z==3) System.out.print("3, ");
			else if(z==4) System.out.print("4, ");
			else if(z==5) System.out.print("5, ");
			else if(z==6) System.out.print("6, ");
			else System.out.print("inna, ");
			z++;
		} while (z<10);
	}
	
	public static void zabawaStaticTestem(){
		System.out.println(StaticTest.ii);
		StaticTest oST = new StaticTest();
		System.out.println(++oST.ii);
		StaticTest.ii++;
		System.out.println(oST.ii);
		StaticFun.incr();
		System.out.println(StaticTest.ii);
		StaticFun oSF = new StaticFun();
		oSF.incr();
		System.out.println(StaticTest.ii);
	}

	public static void main(String[] args) {
//
//		Obiekt[] tablica = { new Obiekt("Pierwszy", 1), new Obiekt("Drugi", 2), new Obiekt("Trzeci", 3) };
//		wypiszObiekty(tablica);
//		wypiszObiekty(new Obiekt[] { new Obiekt("Pierwszy bis", 101), new Obiekt("Drugi  bis", 102),
//				new Obiekt("Trzeci bis", 103) });
//		System.out.println();
//		System.out.println(Arrays.asList(wypelnij(10)));
//		System.out.println();
//		Integer[] tab1 = new Integer[] { 1, 2, 3, 4, 5 };
//		Integer[] tab2 = new Integer[] { 6, 7, 8, 9 };
//		System.out.println(Arrays.asList(laczenieTablic(tab1, tab2)));
//		System.out.println();
//		elsIf();
		zabawaStaticTestem();
	}

}
