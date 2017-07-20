package pakietDef;

import java.util.ArrayList;
import java.util.List;

public class OddOccurencesInArray {

	
	public static int solution(int[] A){
		
		List<Integer> lista = new ArrayList<>();
        for(int i = 0; i<A.length;i++){
        	lista.add(A[i]);
        }
		lista.sort(null);
		int ile = lista.size();
		int i = 0;
		int liczba1 = 0, liczba2 = 0;
		while(true){
			liczba1=lista.get(i++);
			if(i==ile) return liczba1;
			liczba2=lista.get(i++);
			if(liczba1!=liczba2)
				return(liczba1);	
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {0,2,0,2,4};
		System.out.println(solution(A));

	}

}
