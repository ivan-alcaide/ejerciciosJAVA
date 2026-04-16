package actividades_6_7_8_9_10;

import java.util.ArrayList;
import java.util.List;

public class Actividad9 {

	public static void main(String[] args) {
		
		List<Integer> numeros=new ArrayList<>(List.of(4,-2,5,7,8,9,11,12,13,14));
		List<Integer> numeros2=new ArrayList<>(List.of(4,5,7,8,9,11,12,13,14));


		boolean existe=numeros.stream().anyMatch(n -> n<0);
		boolean noExiste=numeros2.stream().anyMatch(n->n<0);
		
		System.out.println(existe);
		System.out.println(noExiste);

	}

}
