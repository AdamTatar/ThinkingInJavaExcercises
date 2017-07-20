package pakietDef;

import java.util.*;

public class Zadanie3 {
	
	
	public static int solution(String S) {
		// write your code in Java SE 8
		
//		char[] tab = new char[S.length()];
//		tab = S.toCharArray();

//		if(S.equals("13+62*7+*")) return 76;
//		else return -1;
//		
		
		
		Queue kol = new ArrayDeque();
		
		for(int i = 0; i<S.length();i++){
//			char c = tab[i];
		
			String c = S.substring(i, i+1);
			int czyLiczba = 0;
			
			String ilocz = "*";
			String plus = "+";
			if(c.equals(ilocz)){
				int a = (int)kol.poll();
				int b = (int)kol.poll();
				kol.add(Integer.toString(a*b));
			}
			if(c.equals(plus)){
				
				System.out.println("c.equals(plus), c: "+c);
				
				int a = (int)kol.poll();
				int b = (int)kol.poll();
				if(kol.add(Integer.toString(a+b)))
					System.out.println("kol.add(Integer.toString(a+b)); -> TRUE");
				else
					System.out.println("kol.add(Integer.toString(a+b)); -> FALSE");
				
			}
			else{
				try {
					czyLiczba =  Integer.parseInt(c);
					kol.add(czyLiczba);
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					System.out.println("Wyjątek 001");
					e.printStackTrace();
				}
				System.out.println(czyLiczba);
				
			}
				
		}
		
		return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String S = "13+62*7+*";
		System.out.println(solution(S));

	}
}
