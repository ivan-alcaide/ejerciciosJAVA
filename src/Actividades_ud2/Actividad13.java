package Actividades_ud2;
//importamos el lector
import java.util.Scanner;
public class Actividad13 {

	public static void main(String[] args) {
		//creo el lector
		Scanner sc=new Scanner(System.in);
		
		//defino las variables
		int hora, minutos, segundos;
		
		//pido al usuario los numeros y los hago objetos a las variables
		System.out.println("A continuación voy a pedirle la hora actual, es decir diga la hora de 00-23 y el minuto y el segundo de 00-59");
		System.out.println("Diga la hora actual: ");
		hora= sc.nextInt();
		
		System.out.println("Diga el minuto actual: ");
		minutos = sc.nextInt();
		
		System.out.println("Diga el segundo actual: ");
		segundos=sc.nextInt();
		
		//le sumo 1 a los segundos
		segundos++;
		
		
		//hago la estrctura condicional en la que si la hora no es correcta no sigue el programa y si es correcta hay una subestructura condicional en la que da la respuesta debida en cada caso
		if (hora>23||hora<0||minutos>59||minutos<0||segundos>60||segundos<0) {
			System.out.println("Diga una hora coherente");
		}else {
			if (segundos==60) {
			minutos++;
			segundos= segundos - 60;
			if(minutos==60) {                        //aqui a la izquierda he hecho el calculo en el que si el segundo es 60 se suma un minuto y si el minuto es 60 se suma una hora y si la hora es 23 se pasa a 00
				hora++;
				minutos= minutos-60;
				if(hora==24) {
					hora=hora-24;
				}
			}
		}if (segundos<10) {
			
			if(minutos<10 && hora<10) {
				System.out.println("La hora actual es " + 0 + hora + ":" + 0 + minutos + ":" + 0 + segundos);
			}else if (minutos<10) {
				System.out.println("La hora actual es " + hora + ":" + 0 + minutos + ":" + 0 + segundos);
			}else if(hora<10) {
				System.out.println("La hora actual es " + 0 + hora + ":" + minutos + ":" + 0 + segundos);
			}else {
				System.out.println("La hora actual es " + hora + ":" + minutos + ":" + 0 + segundos);
			}
		}else if (minutos<10) {
			if (hora<10) {
				System.out.println("La hora actual es " + 0 + hora + ":" + 0 + minutos + ":" + segundos);
			}else {
				System.out.println("La hora actual es " + hora + ":" + 0 + minutos + ":" + segundos);
			}
			
		}else if (hora<10) {
			System.out.println("La hora actual es 0" + hora + ":" + minutos + ":" + segundos);
		
		}else {
			System.out.println("La hora actual es " + hora + ":" + minutos + ":" + segundos);
		
	
		}
		}	
	}

}
