package Actividades_ud5;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad10 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuántos números vas a introducir?");
        int n = sc.nextInt();

        int[] numeros = new int[n];

        //leer los números
        for (int i = 0; i < n; i++) {
            System.out.println("Introduce el número " + (i + 1) + ":");
            numeros[i] = sc.nextInt();
        }

        //contar cuántos pares hay
        int cuentaPares = 0;
        for (int i = 0; i < n; i++) {
            if (numeros[i] % 2 == 0) {
                cuentaPares++;
            }
        }

        //definir las tablas de pares e impares
        int[] valoresPares = new int[cuentaPares];
        int[] valoresImpares = new int[n - cuentaPares];

        //meter los números en las tablas correspondientes
        int indicePar = 0;
        int indiceImpar = 0;

        for (int i = 0; i < n; i++) {
            if (numeros[i] % 2 == 0) {
                valoresPares[indicePar] = numeros[i];
                indicePar++;
            } else {
                valoresImpares[indiceImpar] = numeros[i];
                indiceImpar++;
            }
        }

        //mostrar resultados
        System.out.println("Números introducidos: " + Arrays.toString(numeros));
        
        System.out.println("Números pares: "+ Arrays.toString(valoresPares));
       
        System.out.println("Números impares: "+ Arrays.toString(valoresImpares));
       

        
    }
}

