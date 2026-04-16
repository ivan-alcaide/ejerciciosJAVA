package actividades_1_2_3_4_5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Actividad5 {

	public static void main(String[] args) {
		
		List<Integer> numeros=new ArrayList<>(List.of(4,5,6,7,8,9,10,11,12,13,14));
		
		List<Integer> mayores=numeros.stream().filter(n -> n > 10).collect(Collectors.toList());
		
		System.out.println(mayores);

	}

}
