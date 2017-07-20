package pakietDef;

import java.util.*;

public class MissingInteger {
	//77% - jak jest jeden element to jest źle wg nich
	 public static int solution(int[] A) {
	        // write your code in Java SE 8
		 
		 if(A.length==1) {
			 return (A[0]+1);
		 }
		 if(A.length==0){
			 return 0;
		 }
		 
		 Arrays.sort(A);
		 Set<Integer> set = new TreeSet<>();
		 for(int i = 0; i<A.length;i++){
			 set.add(A[i]);
		 }
		 int i;
		 for(i = 1;i<=set.size();i++)
			 if(set.contains(i)==true)
				 continue;
			 else
				 return i;
		 return i+1;
	    }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A = {1,6,5,4,1,2};
		int[] B = {1,3,6,4,1,2};

		int[] C = {5};
		int[] D = {0};
		int[] E = {1};
		int[] F = {};
		
		
		
		System.out.println(solution(A));
		System.out.println(solution(B));
		System.out.println(solution(C));
		System.out.println(solution(D));
		System.out.println(solution(E));
		System.out.println(solution(F));
		
		
		
		
		
		
		
		
		

	}

}





//
//
//Write a function:
//
//    class Solution { public int solution(int[] A); }
//
//that, given a non-empty zero-indexed array A of N integers, returns the minimal positive integer (greater than 0) that does not 
//occur in A.
//
//For example, given:
//  A[0] = 1
//  A[1] = 3
//  A[2] = 6
//  A[3] = 4
//  A[4] = 1
//  A[5] = 2
//
//the function should return 5.
//
//Assume that:
//
//        N is an integer within the range [1..100,000];
//        each element of array A is an integer within the range [−2,147,483,648..2,147,483,647].
//
//Complexity:
//
//        expected worst-case time complexity is O(N);
//        expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
//
//Elements of input arrays can be modified.
