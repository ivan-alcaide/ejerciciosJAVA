package Actividades_ud2;
//importo el lector
import java.util.Scanner;

public class Actividad14 {

	public static void main(String[] args) {
		//creo el lector
		Scanner sc=new Scanner(System.in);
		
		//defino las variables
		int dia, mes, anno;
		
		//pido al usuario la fecha y sus respuestas las hago objeto de sus respectivas variables
		System.out.println("A continuación le pido datos para una fecha, la fecha debe ser en años no bisiestos");
		System.out.println("Diga el día de una fecha en concreto");
		dia = sc.nextInt();
		
		System.out.println("Diga el mes de una fecha");
		mes = sc.nextInt();
		
		System.out.println("DIga el año de una fecha");
		anno = sc.nextInt();
		
		//hago la estrcutura condicional en la que primero tengo en cuenta que la fecha sea correcta y si es asi pasamos a la siguiente
		if ((dia>31 || mes>12 || dia<1 || mes<1) || (dia>28 && mes==2) || ((mes==4 || mes==6 || mes==9 || mes==11) && (dia>30))) {
			System.out.println("La fecha no es posible");
			
		//aqui hago la suma del dia dependiendo del mes en el que estemos
		}else {
			dia++;
			if ((dia==32) && (mes!=4 || mes!=6 || mes!=9 || mes!=11)) {
				dia = dia-31;
				mes++;
				if (mes==13) {
					anno++;
					mes=mes-12;
					
				}
			}if ((dia==31)&&(mes==4 || mes==6 || mes==9 || mes==11)){
				dia = dia-30;
				mes++;
				if (mes==13) {
					anno++;
					mes=mes-12;
			}
			}if (dia==29 && mes==2) {
				dia=dia-28;
				mes++;
				if (mes==13) {
					anno++;
					mes=mes-12;
				}
		//y aqui imprimo el resultado
		} System.out.println("La fecha del día siguiente sería: " + dia + "/" + mes + "/" + anno);
			
			
		}

	}
}
