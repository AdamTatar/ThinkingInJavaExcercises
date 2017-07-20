package KolekcjeObiektów;

import java.util.ArrayList;

class Mysz {
	private int liczbaMyszy;
	Mysz (int liczbaMyszy) {this.liczbaMyszy = liczbaMyszy;}
	public String toString(){return "Mysz "+liczbaMyszy;}
	public void hop(){System.out.println(this+" skacze");}
}


public class Mysz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Mysz> myszy = new ArrayList<Mysz>();
		for(int i = 0; i<9;i++){
			myszy.add(new Mysz(i));
		}
		for(int i = 0; i<myszy.size();i++){
			myszy.get(i).hop();
		}
		

	}

}
