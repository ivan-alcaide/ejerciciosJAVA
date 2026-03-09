package es.iescamas.market;

import java.util.Comparator;

public class ComparadoresProducto{

	public static final Comparator<Producto> POR_PRECIO_ASC=Comparator.comparing(Producto::getPrecio);
	public static final Comparator<Producto> POR_CATEGORIA_Y_RATING = Comparator.comparing(Producto::getCategoria, Comparator.nullsLast(String::compareToIgnoreCase)).thenComparingDouble(Producto::getRating);



}
