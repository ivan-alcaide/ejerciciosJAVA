package Actividades_ud5;

import java.util.Scanner;

public class Actividad15 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] tabla = new int[5];
        System.out.println("Vas a rellenar una tabla con números pares.");

        int desechados = rellenaPares(tabla);

        System.out.println("Cantidad de números impares desechados: " + desechados);

    
    }

    public static int rellenaPares(int[] tabla) {
        Scanner sc = new Scanner(System.in);
        int impares = 0;
        int i = 0;

        while (i < tabla.length) {
            System.out.print("Introduce un número: ");
            int num = sc.nextInt();

            if (num % 2 == 0) {
                tabla[i] = num;
                i++;
            } else {
                impares++;
                System.out.println("Número impar ignorado.");
            }
        }

        return impares;
    }
}
