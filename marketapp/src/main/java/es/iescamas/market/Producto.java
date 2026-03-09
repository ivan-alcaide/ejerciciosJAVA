package es.iescamas.market;

import es.iescamas.market.interfaces.Descuentable;
import es.iescamas.market.interfaces.Enviable;

/**
 * Representa un producto del catálogo de la aplicación Market.
*/
public class Producto implements Descuentable, Enviable, Comparable<Producto>{

	private String sku;
	private String nombre;
	private String categoria;
	private double precio;
	private double rating;
	private int stock;
	private int ventas;
	private double porcentajeDescuento;
	private double pesoKg;

    /**
     * Construye un producto con todos sus datos.
     *
     * @param sku código único del producto (SKU)
     * @param nombre nombre comercial del producto
     * @param categoria categoría del producto (puede ser {@code null})
     * @param precio precio base del producto (sin descuentos aplicados)
     * @param rating valoración media del producto (p.ej., 0.0..5.0)
     * @param stock unidades disponibles en almacén
     * @param ventas unidades vendidas (para ordenar por “popularidad”)
     * @param porcentajeDescuento descuento en tanto por uno (0.0..1.0)
     * @param pesoKg peso en kilogramos (0.0 si no es enviable; para envío debe ser &gt; 0)
     */
    public Producto(
            String sku,
            String nombre,
            String categoria,
            double precio,
            double rating,
            int stock,
            int ventas,
            double porcentajeDescuento,
            double pesoKg
    ) {

    	this.sku=sku;
    	this.nombre=nombre;
    	this.categoria=categoria;
    	this.precio=precio;
    	this.rating=rating;
    	this.stock=stock;
    	this.ventas=ventas;
    	this.porcentajeDescuento=porcentajeDescuento;
    	this.pesoKg=pesoKg;
    	
    	
    }

	public double getPrecio() {

		return this.precio;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getVentas() {
		return ventas;
	}

	public void setVentas(int ventas) {
		this.ventas = ventas;
	}
	@Override
	public double getPorcentajeDescuento() {
		return porcentajeDescuento;
	}

	
	public void setPorcentajeDescuento(double porcentajeDescuento) {
		this.porcentajeDescuento = porcentajeDescuento;
	}

	@Override
	public double getPesoKg() {
		return pesoKg;
	}

	public void setPesoKg(double pesoKg) {
		this.pesoKg = pesoKg;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int compareTo(Producto a) {
		int ventasA=a.getVentas();
		double ratingA=a.getRating();
		if(this.ventas>ventasA) {
			return -1;
		}else if (this.ventas<ventasA){
			return 0;
		}
		
		if (this.rating>ratingA) {
			return -1;
		}else if(this.rating<ratingA) {
			return 0;
		}
		
		if(this.nombre.compareToIgnoreCase(a.getNombre())<0) {
			return -1;
		}else if(!(this.nombre.compareToIgnoreCase(a.getNombre())>=0)) {
			return 0;
		}
		
		if(this.sku.compareToIgnoreCase(a.getSku())<0) {
			return -1;
		}else {
			return 0;
		}
		
	}
	
	


}
