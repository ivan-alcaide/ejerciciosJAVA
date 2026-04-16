package com.programacion.iescamas.es;

import java.util.List;
import java.util.ArrayList;


public class Pruebas {

	public static void main(String[] args) {
		List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 8, 11, 14);

		List<Integer> pares = numeros.stream()
		    .filter(n -> n % 2 == 0)
		    .toList();

		System.out.println("Números pares: " + pares);
	}
	
	
	

}
