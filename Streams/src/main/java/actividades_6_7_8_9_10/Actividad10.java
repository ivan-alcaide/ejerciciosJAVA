package actividades_6_7_8_9_10;

import java.util.ArrayList;
import java.util.List;

public class Actividad10 {

	public static void main(String[] args) {
		
		List<Integer> numeros=new ArrayList<>(List.of(4,5,7,8,9,11,12,13,14));

		Integer mayor=numeros.stream().max(Integer::compareTo).orElse(null);
		Integer menor=numeros.stream().min(Integer::compareTo).orElse(null);
		
		System.out.println("El mayor de la lista es "+ mayor+ ", y el menor de la lista es " + menor);
		
	}

}
