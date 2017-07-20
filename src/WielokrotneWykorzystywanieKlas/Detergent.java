//: reusing/Detergent.java
// Sk�adnia i w�a�ciwo�ci dziedziczenia.
package WielokrotneWykorzystywanieKlas;


class Cleanser {
  private String s = "Cleanser";
  public void append(String a) { s += a; }
  public void dilute() { append(" dilute()"); }
  public void apply() { append(" apply()"); }
  public void scrub() { append(" scrub()"); }
  public String toString() { return s; }
  public static void main(String[] args) {
    Cleanser x = new Cleanser();
    x.dilute(); x.apply(); x.scrub();
    System.out.println(x);
  }
}	

public class Detergent extends Cleanser {
  // Zmiana metody:
  public void scrub() {
    append(" Detergent.scrub()");
    super.scrub(); // Wywo�anie wersji z klasy bazowej
  }
  // Uzupe�nienie interfejsu o nowe metody:
  public void foam() { append(" foam()"); }
  // Test nowej klasy pochodnej:
  public static void main(String[] args) {
    Detergent x = new Detergent();
    x.dilute();
    x.apply();
    x.scrub();
    x.foam();
    System.out.println(x);
    System.out.println("Test klasy bazowej:");
    Cleanser.main(args);
  }	
} /* Output:
Cleanser dilute() apply() Detergent.scrub() scrub() foam()
Test klasy bazowej:
Cleanser dilute() apply() scrub()
*///:~
