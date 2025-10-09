package Actividades_ud3;


public class Actividad6 {

	public static void main(String[] args) {
		
		//defino las variables
		int multis, factor;
		
		//inicianalizo estas dos variables
		factor=1;
		multis=0;
		
		//creo un for que se repite hasta que de un multiplo mayor que 100
		System.out.println("A continuación verás todos los multiplos de 7 menores que 100");
		for (int siete=7;multis<100;factor++) {
			multis=factor*siete;
			if (multis>100) {
				
			}else {
				System.out.println("7 por " + factor + " es " + multis);
			}
		}

	}

}
