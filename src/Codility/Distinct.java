package pakietDef;

import java.util.HashSet;
import java.util.Set;

public class Distinct {

	
	
	public static int solution(int[] A) {
        // write your code in Java SE 8
		Set<Integer> set = new HashSet<>();
		int i;
		for(i=0;i<A.length;i++)
			set.add(A[i]);
		return set.size();
		
    }
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = {2,1,1,2,3,1};
		
		System.out.println(solution(A));
		
		
	}

}
