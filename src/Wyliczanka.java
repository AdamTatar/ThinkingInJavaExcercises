
public class Wyliczanka {
	public enum Banknoty{DZIESIEC, DWADZIESCIA, PIECDZIESIAT, STO, DWIESCIE, PIECSET}
	public static void main(String[] args){
		for(Banknoty b : Banknoty.values()) System.out.println("Na "+b.ordinal()+" miejscu jest banknot "+b);
		Banknoty bb;
		bb = Banknoty.STO;
		for(Banknoty abb : Banknoty.values()){
		switch(abb){
		case DZIESIEC: System.out.println("Dycha"); break;
		case DWADZIESCIA: System.out.println("Dwie dychy "+abb.name()+" "+abb.ordinal());break;
		case PIECDZIESIAT: System.out.println("Piêæ dych");break;
		case STO: System.out.println("Stówa");break;
		default: System.out.println("Ponad sto");}
		}
		
		}
}

