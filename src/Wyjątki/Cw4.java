package Wyj¹tki;

class MyExc extends Exception {
	String msg;
	MyExc(String s){
		 this.msg = s;
		 show(msg);
	}
	void show(String msg){
		System.out.println(msg);
	}
}


public class Cw4 {

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			
			throw new MyExc("Jajeczko");
		}
		catch (MyExc e){
			System.out.println();
		}

	}

}
