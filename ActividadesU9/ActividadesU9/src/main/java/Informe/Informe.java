package Informe;

public class Informe implements imprimible {
	private String titulo;
	private String autor;
	private String paginas;
	
	
	@Override
	public String imprimir() {
		return null;
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


	public String getPaginas() {
		return paginas;
	}


	public void setPaginas(String paginas) {
		this.paginas = paginas;
	}
	
	
}
