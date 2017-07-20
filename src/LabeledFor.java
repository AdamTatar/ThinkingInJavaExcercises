//: control/LabeledFor.java
// P�tle for z instrukcjami break i continue ze skokiem do etykiety.
//import static net.mindview.util.Print.*;


public class LabeledFor {
	static void print(Object obj){ //s�owo static do metody - ta metoda nie jest zwi�zana z �adnym konkretnym obiektem klasy 
		System.out.println(obj);	// mo�na j� wywo�ywa� nawet wtedy, gdy nie jest utworzony �aden obiekt klasy.
	}

	public static void main(String[] args) {
    int i = 0;
    outer: // Tu nie mo�na wstawia� instrukcji
    for(;;) { // p�tla niesko�czona
      inner: // Tu nie mo�na wstawia� instrukcji
      for(; i < 10; i++) {
        print("i = " + i);
        if(i == 2) {
          print("continue");
          continue;
        }
        if(i == 3) {
          print("break");
          i++; // Inaczej i nie doczeka�oby
               // inkrementacji.
          break;
        }
        if(i == 7) {
          print("continue outer");
          i++; // Inaczej i nie doczeka�oby
               // inkrementacji.
          continue outer;
        }
        if(i == 8) {
          print("break outer");
          break outer;
        }
        for(int k = 0; k < 5; k++) {
          if(k == 3) {
            print("continue inner");
             continue inner;
          }
        }
      }
    }
    // Nie mo�na skoczy� do etykiet za p�tlami
  }
} /* Output:
i = 0
continue inner
i = 1
continue inner
i = 2
continue
i = 3
break
i = 4
continue inner
i = 5
continue inner
i = 6
continue inner
i = 7
continue outer
i = 8
break outer
*///:~
