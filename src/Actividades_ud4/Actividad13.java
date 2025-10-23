package Actividades_ud4;

import java.util.Scanner;

public class Actividad13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Diga el número y te diré su factorial:");
        int n = sc.nextInt();

        System.out.println("Factorial : " + factorial(n));
    }

    ///Función recursiva que calcula el factorial
    public static int factorial(int n) {
        if (n < 0) {
            System.out.println("El factorial no está incluido para números negativos.");
            return 0; // error
        } else if (n == 0) {
            return 1; // caso base: 0! = 1
        } else {
            return n * factorial(n - 1);
        }
    }
}
