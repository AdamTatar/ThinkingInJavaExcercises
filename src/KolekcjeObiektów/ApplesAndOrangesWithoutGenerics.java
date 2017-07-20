package KolekcjeObiektów;
//: holding/ApplesAndOrangesWithoutGenerics.java
//Prosty przyk³ad z kontenerem (prowokuje ostrze¿enia kompilatora).
//{ThrowsException}
import java.util.*;

class Apple {
private static long counter;
private final long id = counter++;
public long id() { return id; }
}

class Orange {}	

public class ApplesAndOrangesWithoutGenerics {
@SuppressWarnings("unchecked")
public static void main(String[] args) {
 ArrayList apples = new ArrayList();
 for(int i = 0; i < 3; i++)
   apples.add(new Apple());
 // Niezabezpieczony przed pomieszaniem jab³ek z pomarañczami:
// apples.add(new Orange());
 for(int i = 0; i < apples.size(); i++)
   System.out.println(((Apple)apples.get(i)).id());
   // Obecnoœæ niepo¿¹danego obiektu Orange jest
   // wykrywana dopiero w czasie wykonania
}
} /* (Execute to see output) *///:~
