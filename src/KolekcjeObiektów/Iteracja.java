package KolekcjeObiektów;

import java.util.*;

public class Iteracja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("Adam");
		lista.add("Ela");
		lista.add("Emilka");
		Iterator<String> it = lista.iterator();
		
//		while(it.hasNext())
//			System.out.println(it.next());
		for(String s : lista)
			System.out.println(s);
		System.out.println("--------------------------");
		while(it.hasNext()){
			String s = it.next();
			System.out.println(s);
		}
		System.out.println("--------------------------");
		it.remove();
		for(String s : lista)
			System.out.println(s);
		
	}

}

