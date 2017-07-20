package Wyj¹tki;




// wychodzi na to ¿e operator trójargumentowy nie dzia³a poza return??? Jak to z nim jest?





public class OperatorTrojargumentowy {

	static String operatorIfElse(int a, int b){		// OPERATOR IF ELSE
		return(a>b ? "A wiêksze do B" : "A mniejsze od B");
	}
	
	static int f(int i){return(i==9 ? 5 : 4);}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println(operatorIfElse(8,7));	
	int a = 3, b= 5;
//	
	System.out.println(Integer.toString(f(8)));
	System.out.println(a>b ? "A wiêksze do B" : "A mniejsze od B"); 
	}

}
