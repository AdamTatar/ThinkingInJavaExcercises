package WielokrotneWykorzystywanieKlas;


class P {
	public static void p(String tekst){System.out.println(tekst);}
}


class A {
	A(){P.p("Jestem klasa A");}
}

class B {
	B(){P.p("Jestem klasa B");}
}


class C extends A {
	B b = new B();
}













public class Trzy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new C();
	}

}
