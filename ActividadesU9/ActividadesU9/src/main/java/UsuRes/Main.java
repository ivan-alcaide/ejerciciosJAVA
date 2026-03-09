package UsuRes;

import Ordenacion.Mostrable;

public class Main {
    public static void main(String[] args) {

        Validable[] objetos = new Validable[4];
        objetos[0] = new Usuario("juan@email.com", "12345678");
        objetos[1] = new Usuario("correoIncorrecto", "1234"); 
        objetos[2] = new Reserva("09/03/2026", 4);
        objetos[3]= new Reserva("09/03/2026", 0);

        for (Validable v : objetos) {
            try {
                v.validar();
                System.out.println("Validación correcta");
            } catch (IllegalArgumentException e) {
                System.out.println("Error de validación: " + e.getMessage());
            }

           
            if (v instanceof Mostrable) {
                Mostrable m = (Mostrable) v;
                System.out.println(m.mostrar());
            }

            System.out.println();
          
        }
    }
}
