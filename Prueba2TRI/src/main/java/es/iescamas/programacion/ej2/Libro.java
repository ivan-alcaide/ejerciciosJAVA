package es.iescamas.programacion.ej2;

public class Libro implements Catalogable{
	private String titulo;
	private String autor;
	private int anyo;
	private double precio;
	private String codigo;

	public Libro (String titulo,String autor,int anyo,double precio) {
		this.titulo=titulo;
		this.autor=autor;
		this.anyo=anyo;
		this.precio=precio;
		this.codigo="LIB-"+anyo+"-";
		
		titulo=titulo.toUpperCase();
		for(int i=0;i<3;i++) {
			this.codigo=this.codigo+titulo.charAt(i);
		}
	}
	
	
	public void mostrarFicha() {
		
		System.out.println("[" + this.anyo + "] " + this.titulo + " - " + this.autor+" (" +  this.precio+ " €)" );
		
	}
	
	
	@Override
	public String getCodigo() {
		return codigo;
	}


	@Override
	public void mostrarEnCatalogo() {
		
		mostrarFicha();
		System.out.println( " ["+this.codigo+"]");
		
	}
	
	

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}



	
	
}
