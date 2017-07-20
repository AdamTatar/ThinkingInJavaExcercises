package pakietDef;

public class PassingCars {

	public static int solution(int[] A) {
		// write your code in Java SE 8

		//moje na 60%
		
//		int ile = 0;
//		for (int i = 0; i < A.length; i++) {
//			if (A[i] == 0) {
//				for (int k = i; k < A.length; k++)
//					if (A[k] == 1) {
//						ile++;
//						if (ile > 1000000000)
//							return -1;
//					}
//			}
//		}
//		return ile;

		//czyjeś nie wiadomo na ile
		
		int countOfZeros = 0, count = 0;

        for (int i = 0; i < A.length; i++){
            if (A[i] == 0) countOfZeros++;                    
            if (A[i] == 1) count += countOfZeros;    
            if (count > 1000000000) return -1;
        }
        return count;
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = { 0, 1, 0, 1, 1 };

		System.out.println(solution(A));

	}

}
