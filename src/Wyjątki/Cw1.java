package Wyj¹tki;

public class Cw1 {

	public static void f() throws Exception {
		System.out.println("Wyrzucam wyj¹tek z f()");
		throw new Exception("Tekst przekazany do konstruktora klasy Exception");
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			f();
		}
		catch(Exception e){
			System.out.println("Blok catch " + e);
		}
		finally {
			System.out.println("Wykonanie finally");
		}
	}

}
