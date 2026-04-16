 package actividades_1_2_3_4_5;

import java.util.Arrays;
import java.util.List;

import jdk.internal.org.jline.terminal.TerminalBuilder.SystemOutput;

public class Actividad1 {

	public static void main(String[] args) {
		
		List<Integer> lista = Arrays.asList(1,2,3,4,5);

		lista.stream().forEach(System.out::println);
		

	}

}
