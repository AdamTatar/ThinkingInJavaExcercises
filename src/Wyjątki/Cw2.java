package Wyj�tki;
import java.util.*;

public class Cw2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Random rand = null;
			rand.nextFloat();
		}
		catch(Exception e){System.out.println("Z�apa�em wyj�tek e: "+e.getMessage() + e.getLocalizedMessage()+ e.getCause());}
		
	}

}
