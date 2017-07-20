package KolekcjeObiektów;

import java.util.ArrayList;

public class Podsumowanie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList apples = new ArrayList();						//pierwszy sposób: nie podaje siê typu w arraylist, ale nie ma zabezpieczenia przed prób¹ 
		 for(int i = 0; i < 6; i++)								//dodania do listy innego typu i mo¿e wyskoczyæ b³¹d.
		   apples.add(new Apple());
		 for(int i = 0; i < apples.size(); i++)
		   System.out.println(((Apple)apples.get(i)).id()+"  i= "+i);		//wtedy te¿ tu trzeba rzutowaæ typ Object na typ elementu, np Apple
		 
		//teraz zrobione z podaniem typu:
		 
		 ArrayList<Apple> jabl = new ArrayList<Apple>();
		    for(int i = 0; i < 3; i++)
		      jabl.add(new Apple());
		    for(int i = 0; i < jabl.size(); i++)
		      System.out.println(jabl.get(i).id()+"  i= "+i);
		    // Sk³adnia foreach:
		    for(Apple c : jabl)
		      System.out.println(c.id());
		  
		 
		 /*
		  * *Dziwny output:			dlaczego tutaj s¹ kolejne elementy tablicy jak one powinny byæ ró¿ne?????? czy mo¿e to jest po prostu inna referencja do tego samego obiektu?
		  * 						// ale jak robiê new to nie robiê nowego obiektu??
		  * 0  i= 0
1  i= 1
2  i= 2
3  i= 3
4  i= 4
5  i= 5
6  i= 0
7  i= 1
8  i= 2
6
7
8

		  */
		 
		 
	}
}
		
		
		
		
		/*
		
		
		import java.util.ArrayList;

public class ApplesAndOrangesWithGenerics {
  public static void main(String[] args) {
    ArrayList<Apple> apples = new ArrayList<Apple>();
    for(int i = 0; i < 3; i++)
      apples.add(new Apple());
    // B³¹d kompilacji:
    // apples.add(new Orange());
    for(int i = 0; i < apples.size(); i++)
      System.out.println(apples.get(i).id());
    // Sk³adnia foreach:
    for(Apple c : apples)
      System.out.println(c.id());
  }
}
		
		
		*/