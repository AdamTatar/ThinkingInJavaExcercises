package KolekcjeObiektów;
import java.util.*;

public class Cw1Myszoskoczek {

	private int ilosc;
	
	Cw1Myszoskoczek(){ilosc = 0;}
	private int skoki = 0;
	public void hop(){
		System.out.println("Wykonano podskok nr "+(++skoki)+"\nJest obecnie "+ilosc+" myszoskoczków");
		//return ilosc;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Cw1Myszoskoczek> myszy = new ArrayList<Cw1Myszoskoczek>();
		for(int i = 0; i < 5; i++){
			myszy.add(new Cw1Myszoskoczek());
		}
		for(int i = 0; i < myszy.size(); i++){
//			System.out.print(myszy.toString()+" ");
//			System.out.println(myszy.get(i));
			myszy.get(i).hop();
		}
		
		for(Object m : myszy){
			System.out.println(m.toString());
		}
		

	}

}
