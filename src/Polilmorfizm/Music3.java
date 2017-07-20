package Polilmorfizm;

//import Polilmorfizm.Music3.Note;

//: polymorphism/music3/Music3.java
//Przyk³ad programu rozszerzalnego.
//package polymorphism.music3;
//import polymorphism.music.Note;
//import static net.mindview.util.System.out.println.*;  		//tu jakaœ kicha z tym jest, nie wiem o co chodzi



class Instrument {
void play(Note n) { System.out.println("Instrument.play() " + n); }
String what() { return "Instrument"; }
void adjust() { System.out.println("Strojenie obiektu Instrument"); }
}

class Wind extends Instrument {
void play(Note n) { System.out.println("Wind.play() " + n); }
String what() { return "Wind"; }
void adjust() { System.out.println("Strojenie obiektu Wind"); }
}	

class Percussion extends Instrument {
void play(Note n) { System.out.println("Percussion.play() " + n); }
String what() { return "Percussion"; }
void adjust() { System.out.println("Strojenie obiektu Percussion"); }
}

class Stringed extends Instrument {
void play(Note n) { System.out.println("Stringed.play() " + n); }
String what() { return "Stringed"; }
void adjust() { System.out.println("Strojenie obiektu Stringed"); }
}

class Brass extends Wind {
void play(Note n) { System.out.println("Brass.play() " + n); }
void adjust() { System.out.println("Strojenie obiektu Brass"); }
}

class Woodwind extends Wind {
void play(Note n) { System.out.println("Woodwind.play() " + n); }
String what() { return "Woodwind"; }
}	


public class Music3 {
// Metoda nie konkretyzuje typu, wiêc mo¿na z ni¹
// stosowaæ nowe typy dodawane do systemu:


	
public static void tune(Instrument i) {
 // ...
 i.play(Note.MIDDLE_C);
}
public static void tuneAll(Instrument[] e) {
 for(Instrument i : e)
   tune(i);
}	
public static void main(String[] args) {
 // Rzutowanie w górê w ramach wstawiania do tablicy:
 Instrument[] orchestra = {
   new Wind(),
   new Percussion(),
   new Stringed(),
   new Brass(),
   new Woodwind()
 };
 tuneAll(orchestra);
}
} /* Output:
Wind.play() MIDDLE_C
Percussion.play() MIDDLE_C
Stringed.play() MIDDLE_C
Brass.play() MIDDLE_C
Woodwind.play() MIDDLE_C
*///:~
