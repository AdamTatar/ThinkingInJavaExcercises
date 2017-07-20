package pakietDef;

public class Zadanie2 {

	public static int solution(int N) {
		// write your code in Java SE 8
		// if(N==0) return 1;
		long krzyz = 4 * (long) N + 1;
		long pozostale = 0;

		for (int i = 1; i < N; i++) {
			for (int k = 1; k < N; k++) {
				if (Math.sqrt(i * i + k * k) < N) {
					pozostale++;
				}
			}
		}

		if ((krzyz + pozostale * 4) > 1000000000)
			return -1;
		int wynik = (int) (krzyz + pozostale * 4);
		return wynik;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(solution(0));
		System.out.println(solution(20000));
		System.out.println(solution(1));
		System.out.println(solution(2));
		System.out.println(solution(3));
		System.out.println(solution(4));
		System.out.println(solution(5));
		System.out.println(solution(6));

	}
}
