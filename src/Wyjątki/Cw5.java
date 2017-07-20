package Wyj¹tki;
import java.util.*;

public class Cw5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		while(true){
			try{
//				(i<9) ? throw new Exception(Integer.toString(i++)) : break;			dlaczego nie dzia³a operator trójargumentowy?????????
				if(i<9)
					throw new Exception(Integer.toString(i++));
				break;
			}
			catch(Exception e){System.out.println(e);}
			finally{System.out.println("Jestem w finally");}
		}
//		i>0 ? i=9 : i=6;
		
	}

}
