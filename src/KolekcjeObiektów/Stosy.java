package KolekcjeObiektów;

import java.util.LinkedList;

class Stos<T> {														//tu jest definicjê klasy z u¿yciem typu ogólnego
	private LinkedList<T> storage = new LinkedList<T>();			//jest wykorzystanie linked list do u¿ycia jako stos
	public void push(T v) {storage.addFirst(v);}					//bo stos z java util stack jest do bani
	public T peek() {return storage.getFirst();}
	public T pop() {return storage.removeFirst();}
	public boolean empty() {return storage.isEmpty();}
	public String toString() {return storage.toString();}
	
}

public class Stosy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stos<String> stos = new Stos<String>();
		for(String s : "Moja kochana Ela jest bardzo ale to bardzo œliczna i kochana".split(" "))			//fajne dzielenie Stringa
			stos.push(s);
		while(!stos.empty())
			System.out.print(stos.pop()+" ");
		System.out.println();
		while(!stos.empty())
			stos.pop();
		String s = "+³+a+B---+a+g+a---+n-+ -+w-+ -+t+i+l---+e-+k+r--+h+c+a---";
		boolean dodaj = false, usun = false;
		for(String a : s.split("")){
		//	System.out.print(a);
			if(a.equals("+")){
				dodaj = true;
				continue;
			}
			if(a.equals("-")){
				System.out.print(stos.pop());
			}
			if(dodaj == true){
//				System.out.print(a);
				stos.push(a);
			}
			dodaj = false;
			usun = false;
			
			
			
		}

	}

}
