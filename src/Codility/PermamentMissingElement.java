package pakietDef;

import java.util.*;

public class PermamentMissingElement {

	public static int solution(int[] A) {
        // write your code in Java SE 8
		if(A.length==0)return 1;
		
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<A.length;i++)
			list.add(A[i]);
		list.sort(null);
		for(int i = 1; i<=A.length;i++){
			if(i==list.get(i-1)) continue;//System.out.println("i = "+i+", list.get(i-1) = "+list.get(i-1));
			else return i;
		}
return 1;		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = {1 };
		System.out.println(solution(A));

	}

}
