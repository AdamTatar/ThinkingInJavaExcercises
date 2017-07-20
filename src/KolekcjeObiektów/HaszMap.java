package KolekcjeObiektów;
import java.util.*;

public class HaszMap {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> mapa = new HashMap<Integer,String>();
		mapa.put(0, "Zero");
		mapa.put(1, "Jeden");
		mapa.put(2, "Dwa");
		mapa.put(3, "Trzy");
		mapa.put(4, "Cztery");
		mapa.put(5, "Piêæ");
		System.out.println(mapa);
		System.out.println("Próbujê znalezc jedynkê = "+mapa.get(1));
		System.out.println("Czy jest element '3': "+mapa.containsKey(3));
		System.out.println("Czy jest element '6': "+mapa.containsKey(6));
		System.out.println("Klucze: "+ mapa.keySet());
		System.out.println("Wartoœci: "+ mapa.values());
		System.out.println("Patrzê czy zawiera 'cztery': "+ mapa.containsValue("Cztery"));
		System.out.println(mapa);
		
		System.out.println("Na koniec czyszczê mapê: ");
		mapa.clear();
		System.out.println(mapa);
		
	}

}
