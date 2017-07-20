package WielokrotneWykorzystywanieKlas;


public class Dwa {
	public static void p(Object obj){System.out.println(obj);}
	Dwa(){p("Konstruktor Dwa");}
	public static void main(String[] args){
		new DwaTrzy();
	}

}
class DwaJeden extends Dwa {DwaJeden(){p("Konstruktor DwaJeden");}}
class DwaDwa extends DwaJeden {DwaDwa(){p("Konstruktor DwaDwa");}}
class DwaTrzy extends DwaDwa {DwaTrzy(){p("Konstruktor DwaTrzy");}


}