import java.util.*;
//import zabawa001; // jak zaimportowa� co�???
//import pakiet01.*;
//import hello.src.pl.javastart.first.*; //dlaczego to nie dzia�a???????




//konstruktory
class Kamien{
	Kamien(){ // jak bez argument�w to nazywa si� konstruktorem domy�lnym
		System.out.print("Kamie� ");
	}
}
class Kamien2{
	Kamien2(int i){ // konstruktor jest specjalnym rodzajem metody bo nie posiada wartosci zwracanej
		System.out.print("Kamie� " + i + "; ");
	}
}
class Lancuch {
	Lancuch(){
		String tekst001 = "Pupa";
		System.out.println(tekst001);
	}
}
class Klasa01 {
	Klasa01(){System.out.println("Utworzy�em konstruktor domy�lny klasy 01 :)");}
	Klasa01(String str){System.out.println("Utworzy�em konstruktor domy�lny klasy 01 z tekstem: "+str);}
}
class Dog {
	static void bark() {
		System.out.println("Bark bez argumentu");
	}
	static void bark(int i) {
		for(int a = 0; a<i; a++) System.out.println("Bark z argumentem int");
	}
	static void bark(String s) {
		System.out.println("Bark z argumentem string: "+s);
	}
	static void bark(double d) {
		System.out.println("Bark z argumentem double: "+d);
	}
	static void bark(int i, double d) {
		System.out.println("Bark z argumentem int i = "+i+" i double d= "+d);
	}
	static void bark(double d, int i) {
		System.out.println("A to zupe�nie co innego. i= "+i+" d= "+d);
	}
}
class DoThis{ 		 //tutaj mam dwa przeci��one konstruktory, s�owem this wywo�uj� drugi konstruktor z pierwszego
	DoThis(int i){
		this("M�j wpisany tekst");
		System.out.println("Konstruktor z int");
	}
	DoThis(String s){
		System.out.println("Konstruktor ze Stringiem s: "+s);
	}
}
class DoStringow{
	DoStringow(String ss){
		System.out.println(ss);
	}
}
enum Ostrosc{NIE, LAGODNY, SREDNI, OSTRY, PALACY}     //cwiczenie do typow wyliczeniowych: typ wyliczeniowy dobrze sie uzywa ze SWITCH
class Burito{
	Ostrosc stopien;
	public Burito(Ostrosc stopien){this.stopien=stopien;}
	public void opis(){
		System.out.print("To burito jest ");
		switch(stopien){
			case NIE: 
			case LAGODNY: System.out.println("�agodne."); break;
			case SREDNI: System.out.println("lekko pikantne."); break;
			case OSTRY:
			case PALACY: 
			default: System.out.println("zdecydowanie za ostre!.");}			
	}
	
}


public class InfoZKsiazki { //nazwa klasy od wielkiej litery, wsz�dzie indziej zaczyna si� ma�� liter�

	public enum Wyliczanka{ENE, DUE, LIKE, FAKE, TORBA, BORBA, USME, SMAKE}
	//public enum Ostrosc{NIE, LAGODNY, SREDNI, OSTRY, PALACY}

		
	static void print(Object obj){ //s�owo static do metody - ta metoda nie jest zwi�zana z �adnym konkretnym obiektem klasy 
		System.out.println(obj);	// mo�na j� wywo�ywa� nawet wtedy, gdy nie jest utworzony �aden obiekt klasy.
	}
	static int wielkosc (String s){ //d�ugo�� tekstu
		return (s.length());
	}
	static Date data(){	//generowanie bie��cj daty i czasu
		return new Date(); //tworzony jest obiekt i jak nie jest potrzebny to zostanie usuniety przez garbage colllector
	}
	class Letter {
		char c;
	}	
	static void operatoryBitowe(){
		Boolean pr = true, fa = false;
		print((pr&pr) + " " + (pr&fa) + " " + (fa&fa)); //koniunkcja
		print((pr|pr) + " " + (pr|fa) + " " + (fa|fa)); //alternatywa
		print((pr^pr) + " " + (pr^fa) + " " + (fa^fa)); //XOR
		//print((prpr) + " " + (pr&fa) + " " + (fa&fa));
	}
	static void przesunieciaBitowe() {
		int i = -1;
		print(Integer.toBinaryString(i));
		i>>>= 10;
		print(Integer.toBinaryString(i));
	}
	static String operatorIfElse(int a, int b){		// OPERATOR IF ELSE
		return(a>b ? "A wi�ksze do B" : "A mniejsze od B");
	}
	static void sterowaniePrzebiegiem(){
		int a=0,b=1;
		print(a<b ? "mniejsze" : "nie jajko"); 	// operator if else
		if(a<b)									//if else
			print("mniejsze");
		else
			print("nie mniejsze");
		while(true){							//while
			a++;
			print(a);
			if(a==4)
				break;
		}
		do{										//do while
			print("przebieg "+(b++));}
		while(b<3);
		for(char i = 32; i<128; i++)
			System.out.print(i);
		print("");
		for(char i = 32; i<128; i++)
			if(Character.isLowerCase(i)) 
				System.out.print(i);
		print("");
		//sk�adnia foreach:
		Random rand = new Random();
		float f[] = new float[5]; 
		for(int i = 0; i<5; i++)
			f[i] = rand.nextFloat();		// przy wstawianiu elemnt�w w tablice trzeba jawnie poda� indeks w tablicy
		for(float x : f)					//foreach : instrukcja definiuje zmienn� x i przypisuje jej kolejne warto�ci pobierane z tablicy
			print(x);
		for(char c : "Alternatywa".toCharArray())
			System.out.print(c+" ");
		// break i continue i etykiety
		int z = 0;
		print("z = 0");
		duza:
			for(;;){
				print("pocz�tek du�ej p�tli niesko�czonej");
				for(;z<10;z++){
					
					if(z==5){
						print("Tu jest continue przy 5... z = "+z);
						continue;
					}
					if(z==8){
						print("Jest if przy Z. id� do etykiety 'duza' z = "+z++);
						continue duza;
					}
					print("z = "+z);	
				}
					print("Wyszed�em z ma�ej p�tli...");
					break;
			}
		for(z=0;z<100;z++){
			int x = rand.nextInt(26) + 'a';
			System.out.print("Kod znaku: "+x+" ,litera: "+(char)x+" , ");
			switch(x){
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				print("samog�oska"); break;
			case 'z':
				print("po prostu 'z'"); break;
			default: print("sp�g�oska");
			}}}
	static void fibonacci(int i){
		int ciag[] = new int[i];
		ciag[0] = 1; ciag[1] = 1;
		for(int p = 2;p<i;p++)
			ciag[p]= ciag[p-1]+ciag[p-2];
		for(int z : ciag)
			System.out.print(z+", ");
	}			
	static void fibonacci(){
		int ciag[] = new int[15];
		ciag[0] = 1; ciag[1] = 1;
		for(int p = 2;p<15;p++)
			ciag[p]= ciag[p-1]+ciag[p-2];
		for(int z : ciag)
			System.out.print(z+", ");
	}			
	static void kodyASCI(){
		for(char a = 32; a<128; a++)
			print((int) a + ": " + a);
	}
	static void tablice(){
		Random rand = new Random();
		int[] a = new int[rand.nextInt(35)];
		print("Rozmiar a = "+a.length + "\n"+Arrays.toString(a));
		for(int i = 0; i<a.length;i++)
			a[i]=rand.nextInt(100000);
		print(Arrays.toString(a));
		byte[] b = new byte[rand.nextInt(500)];
		print("Rozmiar b = "+ b.length + "\n"+Arrays.toString(b));
		for(int i = 0; i<b.length;i++)
			b[i]=(byte)i;
		print(Arrays.toString(b));
		String[] str = new String[10];//{"Adam", "Ela", "Muhd�a",};
		str = new String[]{"Adam", "Ela", "Muhd�a",};
		for(String s1 : str)
			print(s1);
		str[3]="Emilka";
		for(String s1 : str)
			print(s1);		
	}
	public static int[] range(int n){
		int[] result = new int[n];
		for(int i = 0; i<n; i++)
			result[i]=i;
		return result;		
	}

	public static int[] range(int start, int end){
		int[] result = new int[end - start];
		for(int i = 0; i<end - start; i++)
			result[i]=start + i;
		return result;		
	}

	public static int[] range(int start, int end, int step){
		int sz = (end-start)/step;
		int[] result = new int[sz];
		for(int i = 0; i<sz; i++)
			result[i]=start + (i*step);
		return result;		
	}
	private static void SloikiHIPP(){
		double cena = 4.49;
		double znizka = 0.06;
		double cena3sloiki=cena*3,
				cenaPromocja=cena*3/4,
				poRabacie=cenaPromocja-(cenaPromocja*0.06);
		print("Jeden s�oik kosztuje normalnie 5,39, a w promocji "+cena);
		print("Je�eli trzy s�oiki kosztuj� "+cena3sloiki+" a dostaje si� cztery, to realnie cena za s�oik wychodzi "+cenaPromocja);
		print("Po uwzgl�dnieniu rabatu w wysoko�ci 6% cena za s�oik wynosi "+poRabacie+" czyli o "+(5.39-poRabacie)+" taniej niz normalnie.");
	}
	
	
	String s;
	
	public static void main(String[] args) {		//args - tablica string�w potrzebna jako argumenty przy wywo�aniu z wiersza polece�
		// TODO Auto-generated method stub
		//String jd="Jaka d�ugo�� tekstu?";
		//print(wielkosc(jd));
		
		//print(data());  
		//print(System.getProperty("java.library.path"));
		/*
		Random a = new Random();
		for(int x=0;x<10;x++){
			print(a.nextInt(5));
		}
		int i = 0x2f;
		print(i);
		*/
		//operatoryBitowe();
		//przesunieciaBitowe();
		//print(operatorIfElse(3,4));
		//print(Math.round(0.7)); //zaokr�glanie
		//sterowaniePrzebiegiem();
		//kodyASCI();
		//fibonacci(24); // metoda przeci��ona
		//fibonacci();
		//liczbaWampirza(); - tego nie uda�o mi si� zrobi�
		//konstruktory:
		//for(int i=0; i<15;i++) new Kamien();
		//for(int i=0; i<15;i++) new Kamien2(i);
		//InfoZKsiazki aaa = new InfoZKsiazki(); //to jest do tego String s tu� nad main
		//print(aaa.s);
		//new Klasa01();
		//new Klasa01("Jajeczko666");//konstruktor przeci��ony
		/*Dog pies = new Dog(); //to jest cwieczenie 5 ze strony 153 
		pies.bark();					
		pies.bark(3);							//tu jest kilka metod przeci��onych w klasie Dog i je wywo�uj�
		pies.bark("Ha�, ha�, ha�...");
		pies.bark(0.05412871);
		pies.bark(666, 0.666);
		pies.bark(0.5555, 3);*/
		//S�owo kluczowe this
		//new DoThis(1);
		//tablice();
/*		new DoStringow("Tekst wpisany na pr�b�...");
		DoStringow[] ds = new DoStringow[10];     	// to jest tablica referencji do obiektu - nie wypisuj� si� teksty, bo nie zainicjalizowano obiekt�w
		ds[2]= new DoStringow("Jajeczko");			// dopiero tu przy inicjalizacji si� wypisuj�
		for(int i = 0;i<10;i++)
			ds[i]=new DoStringow("To jest element nr: "+i);
*/		// zmienna lista argument�w i w og�le argumenty do metod i tablice argument�w ok strony 176
		//typy wyliczeniowe 182
/*		for(Wyliczanka wyl : Wyliczanka.values())
			print(wyl+", miejsce w wyliczance: "+wyl.ordinal());
		Wyliczanka wyl1 = Wyliczanka.ENE; print(wyl1);*/

/*		Burito
			zwykle = new Burito(Ostrosc.LAGODNY),
			srednie = new Burito(Ostrosc.SREDNI),			// do tego jeszcze  cwiczenie Wyliczanka.java
			ostre = new Burito(Ostrosc.OSTRY);
		zwykle.opis();
		srednie.opis();
		ostre.opis();    */
		//KlasaPakietowa klp = new KlasaPakietowa(1);
		//int a = KlasaPakietowa.napisz();
		//print(a);
		//odwo�anie do klasy z innego pakietu:
//		new DrugaKlasa();
//		new DrugaKlasa(1);
//		System.out.println(DrugaKlasa.zwrocPlusJeden(15)); 		//dlaczego tutaj musze sie odwolac do metody przez podanie pe�nej �cie�kido drugiej klasy???
//		print("Ka�amarz");
//		System.out.println(range(20));
//		System.out.println(range(10,20));
//		for(int x : range(10,25, 3))		
	//		System.out.println(x);
		CzyPrywatna klasaa = new CzyPrywatna();
		System.out.println(klasaa.metoda2());
		klasaa.metoda3();
		System.out.println(klasaa.metoda4(3));
		SloikiHIPP();
		//teraz robi� dziedziczenie w pakiecie WielokrotneWykorzystanieKlas
		//Rzutowaniw w g�r� - konwersja referencji klasy wywiedzionej do klasy bazowej
		
		
	}
	
	
	
	
	

}
