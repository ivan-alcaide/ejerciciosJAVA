package reproductor;

import Ordenacion.Mostrable;

public class Cancion implements Reproducible,Mostrable{

	private Accion acc;
	private String titulo;
	private String autor;
	private int duracion;
	
	public Cancion(String titulo,String autor,int duracion) {
		this.titulo=titulo;
		this.autor=autor;
		this.duracion=duracion;
		this.acc=Accion.NoEstaReproductor;
	}

	@Override
	public String mostrar() {
		return null;
	}

	@Override
	public void play() {
		
		if (acc.equals(Accion.Reproduciendo)) {
			System.out.println("Esta pista ya se esta reproduciendo");
		}else {
			this.acc=Accion.Reproduciendo;
			System.out.println("Se ha empezado ha reproducir la cancion");
		}
	}
		
		

	@Override
	public void pause() {
		if(acc.equals(Accion.Pausado)) {
			System.out.println("Esta pista ya esta pausada");
		}else {
			this.acc=Accion.Pausado;
			System.out.println("Se ha pausado la cancion");
		}
		
	}

	@Override
	public void stop() {

		if (acc.equals(Accion.NoEstaReproductor)) {
			System.out.println("Esta pista no está en el reproductor");
			
		}else {
			this.acc=Accion.NoEstaReproductor;
			System.out.println("Se ha removido la cancion del reproductor");
		}
		
		
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

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	
}
