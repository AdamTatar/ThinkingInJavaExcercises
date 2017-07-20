package KolekcjeObiektow2;

import java.util.*;

class Obiekt {
	private String nazwa;
	private int rozmiar;

	Obiekt() {
		this.nazwa = "Domyœlna nazwa";
		this.rozmiar = 0;
	}

	Obiekt(String nazwa, int rozmiar) {
		this.nazwa = nazwa;
		this.rozmiar = rozmiar;
	}

	public String toString() {
		return "Obiekt o nazwie " + nazwa + " i rozmiarze " + rozmiar;
	}

}

public class ArajList {

	public String toString() {
		return "Obiekt ArajList";

	}

	public static void jajeczko() {
		ArrayList<String> jajko = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			jajko.add("Jajko " + i);
		}
		for (String s : jajko)
			System.out.println(s);
	}

	public static ArajList[] tablicaObiektow(int b) {
		ArajList[] tablica = new ArajList[b];
		for (int a = 0; a < b; a++) {
			tablica[a] = new ArajList();
		}
		return tablica;
	}

	public static void tablicaDwa(int rozmiarTablicy) {
		Obiekt[] tablica = new Obiekt[rozmiarTablicy + 1];
		for (; rozmiarTablicy >= 0; rozmiarTablicy--)
			tablica[rozmiarTablicy] = new Obiekt(Integer.toString(rozmiarTablicy), rozmiarTablicy + 10);
		for (Obiekt o : tablica)
			System.out.println(o);
	}

	public static void zabawaZListami(){
		List<Integer> li = new ArrayList<>();
		li.add(52);
		li.add(4568);
		System.out.println(li);
		System.out.println(Arrays.asList(li));
		for(int i : li)
			System.out.println(i);
		Collection<Integer> col = new ArrayList<>(Arrays.asList(3,4,5,6,7));
		Integer[] more = {10,11,12,13,14};
		col.addAll(Arrays.asList(more));
		Collections.addAll(col, 20,21,22);
		Collections.addAll(col, more);
		System.out.println(col);
		Map<String,String> map = new HashMap<>();
		map.put("Adam", "Tatar");
		map.put("Ela", "Rzepnicka");
		map.put("Emilka", "Tatar");
		System.out.println(map.get("Ela"));
		
		
		
	}
	
	public static void main(String[] args) {

		// jajeczko();
		// System.out.println(Arrays.asList(tablicaObiektow(10)));
//		tablicaDwa(7);
//		Collection<String> c = new ArrayList<>();    - takie rzutowanie w górê na Collection jest OK

		zabawaZListami();
		
	}

}
