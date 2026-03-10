package reproductor;


public class Reproductor {
	
	
	private Reproducible rep;
	
	public Reproductor(Reproducible rep) {
		this.rep=rep;
	}
	
	
	
	public Reproducible getRep() {
		return rep;
	}



	public void cambiarReproducible(Reproducible rep) {
		this.rep = rep;
	}



	public void reproducirPlay() {
		rep.play();
	}
	
	public void reproducirPause() {
		rep.pause();
	}
	
	public void reproducirStop() {
		rep.stop();
	}
}
