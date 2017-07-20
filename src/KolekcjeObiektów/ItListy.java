package KolekcjeObiektów;
import java.util.*;

public class ItListy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		List<String> lis1 = new ArrayList<String>();
		List<String> lis2 = new ArrayList<String>();
		for(;i<10;i++){
			lis1.add(Integer.toString(i));
		}
		for(;i<20;i++){
			lis2.add(Integer.toString(i));
		}
		for(String s : lis1)
			System.out.print(s+", ");
		System.out.println();
		for(String s : lis2)
			System.out.print(s+", ");
		System.out.print("\n---------------------------------------\n");
		if(lis1.size()!=lis2.size())
			System.out.println("Listy nie s¹ tej samej wielkoœci");
		ListIterator<String> it = lis1.listIterator();
		while(it.hasNext()){
			System.out.print(it.next()+"; ");
		}
		System.out.print(it.nextIndex());
		System.out.print("\n---------------------------------------\n");
		ListIterator<String> it2 = lis2.listIterator();
//		System.out.print("\n---"+it2.nextIndex()+"---\n");
		while(it2.hasNext()){
			it2.next();
			it2.set(it.previous());
		}
		while(it2.hasPrevious()){
			it2.previous();
		}
		while(it2.hasNext()){
			System.out.print(it2.next());		}
		
		
		
	}

}
