package ACTIVIDADES;
import java.util.Scanner;
public class Actividad11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double kg_man1, kg_man2, kg_per1, kg_per2, ben_anual, ben_anual_man, ben_anual_per;
		
		System.out.println("¿Cuántos kg de manzanas has vendido en el primer semestre? ");
		kg_man1 = sc.nextDouble();
		System.out.println("¿Y en  el segundo semestre? ");
		kg_man2 = sc.nextDouble();
		
		System.out.println("¿Cuántos kg de peras has vendido en el primer semestre? ");
		kg_per1 = sc.nextDouble();
		System.out.println("¿Y en el segundo semestre? ");
		kg_per2 = sc.nextDouble();
		
		
		ben_anual_man = (kg_man1 + kg_man2) * 2.35;
		ben_anual_per = (kg_per1 + kg_per2) * 1.95;
		ben_anual = (ben_anual_man + ben_anual_per);
		
		System.out.println("Has obtenido un beneficio este año gracias a las manzanas de " + ben_anual_man + " euros, gracias a las peras de " + ben_anual_per + " euros, y en total este año de " + ben_anual + " euros.");
		
	}

}
