package actividades_6_7_8_9_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Actividad7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		List<String> nombres=new ArrayList<>(List.of("Ivan","Pepe","Daniel","Ignacio"));

		System.out.println("Escriba una letra");
		String l=sc.nextLine().toLowerCase();
		
		
		List<String> minus=nombres.stream().map(n->n.toLowerCase()).toList();
	
		List<String> letras=minus.stream().filter(n -> n.startsWith(l)).toList();
		
		System.out.println(letras);

	}

}
