package Actividades_ud4;

import java.util.Scanner;

public class Actividad6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean vol;
		System.out.println("di una letra");
		vol = vocal(sc.next().charAt(0));
		System.out.println("¿la letra que has dado es una vocal? " + vol);
		
	}
	public static boolean vocal(char letra) {
		if (letra=='a'||letra=='e'||letra=='i'||letra=='o'||letra=='u') {
			return true;
		}else {
			return false;
		}
	}
}
