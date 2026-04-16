package actividades_6_7_8_9_10;

import java.util.ArrayList;
import java.util.List;

public class Actividad6 {

	public static void main(String[] args) {
		
		List<String> nombres=new ArrayList<>(List.of("Ivan","Pepe","Daniel","Jose"));

		List<String> mayus=nombres.stream().map(n -> n.toUpperCase()).toList();
		
		System.out.println(mayus);
		
	}

}
