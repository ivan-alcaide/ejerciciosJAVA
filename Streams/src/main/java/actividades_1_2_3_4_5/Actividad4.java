package actividades_1_2_3_4_5;

import java.util.ArrayList;
import java.util.List;

public class Actividad4 {

	public static void main(String[] args) {
		
		List<Integer> numeros=new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));
		
		
		Integer suma=numeros.stream().reduce(0, Integer::sum);
		
		System.out.println(suma);

	}

}
