package WielokrotneWykorzystywanieKlas;// S�owo "protected".
class Pr{
	public static void print(Object obj){System.out.println(obj);}
}


class Villain {
  private String name;
  ///private String jajko;
  protected void set(String nm) { name = nm; }
  public Villain(String name) { this.name = name; }
  public String toString() {return "Jestem �obuzem i mam na imi� " + name;}
}	


public class Orc extends Villain {
  private int orcNumber;
  public Orc(String name, int orcNumber) {
    super(name);
    this.orcNumber = orcNumber;
  }
  
  
  public void change(String name, int orcNumber) {
    set(name); // Dost�pna, poniewa� chroniona (nie prywatna)
    this.orcNumber = orcNumber;
  }
  
  
  public String toString() {
    return "Ork " + orcNumber + ": " + super.toString();
  }
  
  public static void main(String[] args) {
    Orc orc = new Orc("Limburger", 12);
    Pr.print(orc);
    orc.change("Bob", 19);
    Pr.print(orc);
  }
} /* Output:
Ork 12: Jestem �obuzem i mam na imi� Limburger
Ork 19: Jestem �obuzem i mam na imi� Bob
*///:~
