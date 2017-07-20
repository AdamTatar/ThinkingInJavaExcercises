package pakietDef;

public class Zadanie1 {
	
	
	public static int solution(int N) {
		// write your code in Java SE 8
		
		
		
		if(N==0) return 0;
		if(N==1) return 1;
		int f = 1;
		int x = 1;
		while(true){
			x++;
			f+=x;
			if(N<f) return x-1;
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(solution(17));

		System.out.println();
		System.out.println();
		System.out.println(solution(15));

		System.out.println();
		System.out.println();
		System.out.println(solution(0));

		System.out.println();
		System.out.println();
		System.out.println(solution(1));

		System.out.println();
		System.out.println();
		System.out.println("dla N = 2: "+solution(2));

		System.out.println();
		System.out.println();
		System.out.println("dla N = 3: "+solution(3));

		System.out.println();
		System.out.println();
		System.out.println("dla N = 4: "+solution(4));

		System.out.println();
		System.out.println();
		System.out.println("dla N = 5: "+solution(5));

		System.out.println();
		System.out.println();
		System.out.println("dla N = 6: "+solution(6));

		System.out.println();
		System.out.println();
		System.out.println("dla N = 1000000000: "+solution(1000000000));

		System.out.println();
		System.out.println();
		

	}

}
