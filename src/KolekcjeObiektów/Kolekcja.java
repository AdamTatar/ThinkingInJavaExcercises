package KolekcjeObiektów;
import java.util.*;
public class Kolekcja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<Integer> k = new ArrayList<Integer>();
		for(int i = 0; i< 10; i++)
			k.add(i);
		k.add(2);
		k.add(2);
		for(Integer a : k)
			System.out.print(a+", ");
	
		Collection<Integer> j = new HashSet<Integer>();
		for(int i = 0; i < 10; i++)
			j.add(i);
		j.add(2);
		j.add(2);
		System.out.println();
		for(Integer q : j)
			System.out.print(q+", ");
		
	}

}
