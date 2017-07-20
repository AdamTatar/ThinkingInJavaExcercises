package KolekcjeObiektów;

import java.util.*;


public class Zbior {

	public static int ile() {
		Random rand = new Random();
		Set<Integer> set = new HashSet<Integer>();
		int a = 50;
		for(int i=0;i<1000;i++){
			set.add(rand.nextInt(a));
			if(set.size()==a){
//				System.out.println("Osi¹gniêto wszystkie mo¿liwoœci przy " + i + " iteracji pêtli");
				return i;
			}
		}
		System.out.println("Nie osi¹gniêto celu...");
		return a;
	}

	
	public static void posortowane(){
		Random rand = new Random();
		SortedSet<Integer> set = new TreeSet<Integer>();
		for(int i=0; i<50; i++)
			set.add(rand.nextInt(30));
		System.out.println("\n------------------------------------------\n"+set+" Size of set: "+set.size());
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=300;i++){
			System.out.print(ile()+" ");
			if(i%50==0)
				System.out.println();
		}
		posortowane();
	}

}
