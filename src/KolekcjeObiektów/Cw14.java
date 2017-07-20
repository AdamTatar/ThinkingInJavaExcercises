package KolekcjeObiektów;

import java.util.*;

public class Cw14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> lista = new LinkedList<Integer>();
		int i = 0;
		int pozycja =0 ;
		for(;i<20;i++){
//			System.out.print("Zawartoœæ listy: ");
			pozycja = lista.size()/2;
//			y65gglista.add(i*2);
			lista.add(pozycja, i);
			
			
			
		}
		
		
		for(Integer a : lista)
			System.out.print(a+";");
		
		System.out.println();
		
		LinkedList<Integer> list = new LinkedList<Integer>();
	    ListIterator<Integer> it = list.listIterator();
	    for(int x = 1; x <= 10; x++) {
	      it.add(x);
	      if(x % 2 == 0)
	        it.previous();
	    }
	    System.out.println(list);
		
		

	}

}
