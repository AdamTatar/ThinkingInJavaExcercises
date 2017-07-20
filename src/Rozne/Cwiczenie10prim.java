import java.util.Scanner;

public class Cwiczenie10prim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner odczyt = new Scanner(System.in);
		String tekst = odczyt.nextLine();
		for(int i=0;i<2;i++){
			tekst += odczyt.nextLine();
		}
		System.out.println(tekst);
		

	}

}
