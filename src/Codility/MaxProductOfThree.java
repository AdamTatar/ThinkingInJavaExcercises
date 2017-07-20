package pakietDef;

import java.util.*;

public class MaxProductOfThree {

	 public static int solution(int[] A) {
	        // write your code in Java SE 8
	 
		 List<Integer> lista = new ArrayList<>();
		 for(int i = 0; i<A.length;i++){
			 lista.add(A[i]);
		 }
		 
		 lista.sort(null);
		 
		 int dodatnie = 0;
		 dodatnie = lista.get(lista.size()-1)*lista.get(lista.size()-2)*lista.get(lista.size()-3);
		 int ujem = lista.get(lista.size()-1)*lista.get(0)*lista.get(1);
		 
		 return (dodatnie>ujem) ? dodatnie : ujem;
	 }
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A= {-3,1,2,-2,5,6};
		
		
		System.out.println("Wynik: "+solution(A));
	}

}
