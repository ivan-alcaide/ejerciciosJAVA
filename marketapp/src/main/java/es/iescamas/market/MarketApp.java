package es.iescamas.market;

import java.util.Arrays;
import java.util.Comparator;


/**
 * MarketApp
 * ---------
 * Utilidad “de negocio” para practicar TDD con:
 *  - Interfaces (Descuentable, Enviable)
 *  - Comparable (orden natural en Producto)
 *  - Comparator (criterios alternativos)
 *  - Tablas (arrays) + ordenación manual (burbuja)
 *
 * ⚠️ Importante para la práctica:
 * - NO se usan colecciones (List/ArrayList/Streams).
 * - La mayoría de métodos devuelven una NUEVA tabla para no modificar el original.
 * - Los tests deben guiar la implementación (TDD).
 */
public class MarketApp {

	public double precioFinal(Producto p, Object precio) {
			double desc=p.getPorcentajeDescuento();
			double prec=(double) precio;
	
			double rest=(desc*prec);
			double precFin=prec-rest;
		return precFin;
	}

	public double costeEnvio(Producto p) {
		double peso=p.getPesoKg();
		
		if (peso<=0) {
			throw new IllegalArgumentException("peso invalido");
		}
		
		return 2.99 + (peso*1.20);
	}

	public Producto[] copiar(Producto[] original) {
		
		Producto[] tabla=Arrays.copyOf(original, original.length);
		
		return tabla;
	}

	public Producto[] ordenarNatural(Producto[] original) {
		
		Producto[] copia=copiar(original);
		
		for (int i = 0; i < copia.length - 1; i++) {
			  for (int j = 0; j < copia.length - 1 - i; j++) {
				 if (copia[j].compareTo(copia[j+1])>0) {
					 Producto temp=copia[j];
					 copia[j]=copia[j+1];
					 copia[j+1]=temp;
				 }
				 
			  }
			}
		return copia;
		
	}

	public Producto[] ordenar(Producto[] t, Comparator<Producto> comparar) {
		Producto [] t2Productos=copiar(t);
		Arrays.sort(t2Productos, comparar);
		return t2Productos;
	}

	public Producto[] filtrarPorCategoria(Producto[] t, String categ) {
		
		
		int contador=0;
		Producto[] filtro= new Producto[0];
		
		for (Producto producto : t) {
			if(producto.getCategoria().equalsIgnoreCase(categ)) {
				contador++;
				filtro=Arrays.copyOf(filtro, filtro.length+1);
				filtro[filtro.length-1]=producto;
			}
		}
		return filtro;
	}
	

}
