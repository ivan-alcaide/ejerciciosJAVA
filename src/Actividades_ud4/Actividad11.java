package Actividades_ud4;

import java.util.Scanner;

public class Actividad11 {
	
	
	 public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        double a;
	        int n;

	        System.out.println("Digame un numero y su potencia");
	        a=sc.nextDouble();
	        n=sc.nextInt();
	        System.out.println("Potencia Iterativa: " + potenciaIterativa(a, n));
	        System.out.println("Potencia Recursiva: " + potenciaRecursiva(a, n));
	    }

    // Versión iterativa
    public static double potenciaIterativa(double a, int n) {
        double resultado = 1.0;
        for (int i = 0; i < n; i++) {
            resultado *= a;
        }
        return resultado;
    }

    //Versión recursiva
    public static double potenciaRecursiva(double a, int n) {
        if (n == 0) {
            return 1.0;
        } else {
            return a * potenciaRecursiva(a, n - 1);
        }
    }


   
}