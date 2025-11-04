package Actividades_ud5;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//definir las tablas
		int[] tabla1=new int[6];
		int[] tabla2=new int[6];
		
		
		//rellenar ambas tablas
		for(int i=0;i<tabla1.length;i++) {
			System.out.println("Introduzca un número para la posición " + i + " de la primera tabla");
			tabla1[i]=sc.nextInt();
		}
		for(int i=0;i<tabla1.length;i++) {
			System.out.println("Introduzca un número para la posición " + i + " de la segunda tabla");
			tabla2[i]=sc.nextInt();
		}
		
		//ordenar las tablas
		Arrays.sort(tabla1);
		Arrays.sort(tabla2);
		
		//definir la tabla final
		int[] tabla_fin=new int[tabla1.length+tabla2.length];
		
		//mostrar las tablas ordenadas
		System.out.println("Primera tabla ordenada: " + Arrays.toString(tabla1));
        System.out.println("Segunda tabla ordenada: " + Arrays.toString(tabla2));

        //fusionar ambas tablas ya ordenadas en tabla_fin
        int f = 0, g = 0, h = 0;

        while (h < tabla_fin.length) {
          
            if (f >= tabla1.length) {
                tabla_fin[h] = tabla2[g];
                g++;
            }

            else if (g >= tabla2.length) {
                tabla_fin[h] = tabla1[f];
                f++;
            }

            else if (tabla1[f] < tabla2[g]) {
                tabla_fin[h] = tabla1[f];
                f++;
            } else {
                tabla_fin[h] = tabla2[g];
                g++;
            }
            h++;
        }

        //mostrar la tabla final fusionada y ordenada
        System.out.println("Tabla fusionada ordenada: " + Arrays.toString(tabla_fin));
		
	}

}
