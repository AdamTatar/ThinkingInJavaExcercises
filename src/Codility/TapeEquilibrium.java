package pakietDef;

import java.util.*;

public class TapeEquilibrium {

	// to jest na 50% - jest poprawnie zupełnie, ale wszystko jest za wolno
	
	
    public static int solution(int[] A) {
        // write your code in Java SE 8
    	
    	
    	int suma = 0;
    	int lewa = 0;
    	int roznica = 0;
    	int[] roznice = new int[A.length-1];
    	for(int i = 0; i< A.length;i++){
    		suma += A[i];
    	}
    	for(int i = 0; i<A.length-1; i++){
    		for(int k = 0; k<=i; k++){
    			lewa += A[k];
    			roznica = Math.abs(suma - 2*lewa);
    			if(roznica==0) return 0;
    			roznice[i] = roznica;
    			roznica = 0;
    		}
    		lewa = 0;
    	}
    	Arrays.sort(roznice);
    	return roznice[0];
//    		
//    	int minVal = 0;
//    	minVal = roznice[0];
//    	for(int i = 1; i<roznice.length-1;i++){
//    		if(minVal>roznice[i]){
//    			minVal=roznice[i];
//    		}
//    	}
//
//    	return minVal;
        //sumuje wszystko
        //odejmuje te lewe czesci
        //suma minus dwa razy wartosc
        //jak jest zero to od razu zwracam
        //zwrocic pierwszy najmniejsyz
        //musze miec mape klucz wartosc? posortowac i najmniejsze?
    	
    	
    }

	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {3,1,2,4,3};
		int B[] = {3,1};
		System.out.println(solution(A));
		System.out.println(solution(B));

	}

}



















//A non-empty zero-indexed array A consisting of N integers is given. Array A represents numbers on a tape.
//
//Any integer P, such that 0 < P < N, splits this tape into two non-empty parts: A[0], A[1], ..., A[P − 1] and A[P], A[P + 1], ..., A[N − 1].
//
//The difference between the two parts is the value of: |(A[0] + A[1] + ... + A[P − 1]) − (A[P] + A[P + 1] + ... + A[N − 1])|
//
//In other words, it is the absolute difference between the sum of the first part and the sum of the second part.
//
//For example, consider array A such that:
//  A[0] = 3
//  A[1] = 1
//  A[2] = 2
//  A[3] = 4
//  A[4] = 3
//
//We can split this tape in four places:
//
//        P = 1, difference = |3 − 10| = 7
//        P = 2, difference = |4 − 9| = 5
//        P = 3, difference = |6 − 7| = 1
//        P = 4, difference = |10 − 3| = 7
//
//Write a function:
//
//    class Solution { public int solution(int[] A); }
//
//that, given a non-empty zero-indexed array A of N integers, returns the minimal difference that can be achieved.
//
//For example, given:
//  A[0] = 3
//  A[1] = 1
//  A[2] = 2
//  A[3] = 4
//  A[4] = 3
//
//the function should return 1, as explained above.
//
//Assume that:
//
//        N is an integer within the range [2..100,000];
//        each element of array A is an integer within the range [−1,000..1,000].
//
//Complexity:
//
//        expected worst-case time complexity is O(N);
//        expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
//
//Elements of input arrays can be modified.
//Copyright 2009–2017 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited. 