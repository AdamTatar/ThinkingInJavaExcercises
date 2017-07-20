package pakietDef;

import java.util.*;

public class EquiLeader {

	public static int solution(int[] A) {
        // write your code in Java SE 8
		
		List<Integer> lista = new ArrayList<>();
		for(int i=0;i<A.length;i++){
			lista.add(A[i]);
		}
		lista.sort(null);
		
		System.out.println(lista);
		
		int lider = lista.get((lista.size()/2));
		
		System.out.println(lider);
		
		
		
		
		
		
		
		
		
		return 0;
		
    }
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A ={4,3,4,4,4,2};
		
		
		
		System.out.println("Wynik: "+solution(A));

	}

}
