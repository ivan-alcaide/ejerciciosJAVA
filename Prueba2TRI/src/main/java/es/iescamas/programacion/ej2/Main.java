package es.iescamas.programacion.ej2;

import es.iescamas.programacion.ej1.Libro;

public class Main {

	public static void main(String[] args) {
		Catalogable[] lista=new Catalogable[2];
		
		lista[0]=new Libro("Blancanieves","Paco",1987,12.50);
		lista[1]=new LibroDigital("Los 3 Cerditos", "Pepe",2003,15.85,"EPUB");
		
		
		for(int i=0;i<lista.length;i++) {
			lista[i].mostrarEnCatalogo();
			System.out.println();
		}
		
		/**
		 * Demuestra que la interfaz hace que deos clases puedan 
		 * utilizar los mismo métodos sin complicacion, y puedan ser
		 *  utilizadas esas clases en bucles iguales para 
		 *  diferenciarlas
		 */
	
	}
	
	
}
