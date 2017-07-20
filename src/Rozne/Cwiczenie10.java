import java.util.Scanner;

//import java.util.Scanner;

public class Cwiczenie10 {
	
	public static void main (String[] args){
		//Scanner odczyt = new Scanner(System.in);
		//String[] tab = new String[6]; 
		//String tekst;
	/*	for(int i = 0; i<3; i++){
			tab[i] = odczyt.nextLine();
			//tab = tab + " " + tekst;
			System.out.print(tab);
			System.out.print(tab[i]);
		}
		//System.out.println(tab);
		
		
		String tekst = "";		
		for(int x = 0; x < 5; x++){
			
		
		System.out.println("Wpisz tekst: ");

		tekst += odczyt.nextLine() + " ";
		
		System.out.println(tekst);
		}
		
		
		
		String[] tablica = new String[3];
		tablica[0] = "zero";
		tablica[1] = "jeden";
		tablica[2] = "dwa";
		tablica[3] = "trzy";
	//	System.out.println(tablica[2]);
		
		
		String[] tablica = new String[10];
		 
        for (int i = 0; i < 10; i++)
            tablica[i] = "Element: "+(String) i;
 
        int zmienna = tablica[3];
 
        for (int i = 0; i < 10; i++)
            System.out.println("Kolejna komórka to: " + tablica[i]);
		*/
		
		Scanner o = new Scanner(System.in);
		String[] t = new String[5];
		
		for(int i=0;i<5;i++){
			t[i]=o.nextLine();
		}
		System.out.println(t);
		
	}

}
