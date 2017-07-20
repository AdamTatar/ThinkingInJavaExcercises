package Wyj¹tki;

public class Cw3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int[] tab = new int[2];
			tab[0] = 26;
			tab[1] = 27;
			for(int i : tab)
				System.out.println(i);
			tab[2] = 28;
			for(int i : tab)
				System.out.println(i);
		}
		catch(Exception e){System.out.println(e);}
	}

}
