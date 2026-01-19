package es.texto;
/**
 * Notas rápidas para que el alumnado haga TDD “bien”

Empieza implementando constructores + getters + longitud().

Luego anadirFinal(char) y anadirInicio(char).

Después anadirFinal(String) y anadirInicio(String) con regla “todo o nada” (si no cabe, no modifica).

Finalmente contarVocales().
 */
public class Texto {

	private int maxLongitud;
	private String contenido;
	
	public Texto(int maxLongitud) {
		if(maxLongitud<=0)
			throw new IllegalArgumentException("maxLongitud debe ser > 0");
		this.maxLongitud = maxLongitud;
		this.contenido = "";
	}


	public Texto(String contenido, int maxLongitud) {
	
		if(contenido!=null && contenido.length()>maxLongitud)
			throw new IllegalArgumentException("contenidoInicial supera maxLongitud");
		if(contenido == null)
			throw new IllegalArgumentException("contenidoInicial no puede ser null");
		
	
		this.contenido = contenido;
		this.maxLongitud = maxLongitud;
	}


	public String getContenido() {
		return contenido;
	}


	public int longitud() {
		if(contenido == null) {
			throw new NullPointerException("No tiene longitud un texto null");
		}
		return contenido.length();
	}


}
