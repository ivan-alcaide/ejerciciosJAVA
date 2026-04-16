package actividades_1_2_3_4_5;

import java.util.ArrayList;
import java.util.List;

public class Actividad3 {

	public static void main(String[] args) {
		
		List<Integer> numeros= new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));
		
		List<Integer> cuadrados=numeros.stream().map(n -> n * n).toList();
		
		System.out.println(cuadrados);
		
	}
}
