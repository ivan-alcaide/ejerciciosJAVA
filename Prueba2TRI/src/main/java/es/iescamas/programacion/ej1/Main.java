package es.iescamas.programacion.ej1;

public class Main {

	public static void main(String[] args) {
		
		Libro l1=new Libro("Blancanieves","Paco",1987,12.50);
		Libro l2=new Libro("Los 3 Cerditos", "Pepe",2003,15.85);
		
		System.out.println("Primer libro");
		l1.mostrarFicha();
		System.out.println();
		
		
		System.out.println("Segundo libro");
		l2.mostrarFicha();
		System.out.println();
		
		if(l1.getAnyo()>l2.getAnyo()) {
			System.out.println("El libro más reciente es:");
			l1.mostrarFicha();
		}else if(l2.getAnyo()>l1.getAnyo()) {
			System.out.println("El libro más reciente es:");
			l2.mostrarFicha();
		}else {
			System.out.println("Son de la misma edición");
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("A continuacion los porcentajes de descuento posibles");
		
		double[] desc= {5,10,15,20};
		
		for(int i=0;i<desc.length;i++) {
			System.out.println("Aplicando el descuento de " + desc[i]+"% el precio final del libro se quedaria en:");
			double des=(l1.getPrecio()*desc[i])/100;
			double prec=l1.getPrecio()-des;
			System.out.println(prec + " € precio final");
			
		}
		
		l1.mostrarEnCatalogo();
		
	}
}
