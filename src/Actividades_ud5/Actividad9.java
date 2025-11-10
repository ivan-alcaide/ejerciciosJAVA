package Actividades_ud5;

import java.util.Scanner;

public class Actividad9 {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        final int alumnos = 5;
	        final int trimestres = 3;
	        int[][] notas = new int[alumnos][trimestres];


	        //leer las notas
	        for (int i = 0; i < alumnos; i++) {
	            System.out.println("Alumno " + (i + 1) + ":");
	            for (int j = 0; j < trimestres; j++) {
	                System.out.println("Introduce la nota del trimestre " + (j + 1) + ":");
	                notas[i][j] = sc.nextInt();
	            }
	        }

	        //calcular media del grupo por trimestre
	        System.out.println("Media del grupo en cada trimestre:");
	        for (int j = 0; j < trimestres; j++) {
	            int suma = 0;
	            for (int i = 0; i < alumnos; i++) {
	                suma += notas[i][j];
	            }
	            int media = suma / alumnos;
	            System.out.println("Trimestre " + (j + 1) + ": " + media);
	        }

	        //calcular media del alumno en una posición dada
	        System.out.println("Introduce la posición del alumno (0-4):");
	        int pos = sc.nextInt();

	        if (pos >= 0 && pos < alumnos) {
	            int suma = 0;
	            for (int j = 0; j < trimestres; j++) {
	                suma += notas[pos][j];
	            }
	            int mediaAlumno = suma / trimestres;
	            System.out.println("La media del alumno " + (pos + 1) + " es: " + mediaAlumno);
	        } else {
	            System.out.println("Posición no válida");
	        }

	        
	    }
	}