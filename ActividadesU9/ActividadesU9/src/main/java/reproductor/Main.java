package reproductor;


public class Main {

	public static void main(String[] args) {
		Reproductor rep=new Reproductor(null);
		Reproducible[] pistas=new Reproducible[5];
		pistas[0]=new Cancion("Cancion1","Ivan",3);
		pistas[1]=new Cancion("Cancion2","Juan", 2);
		pistas[2]=new Cancion("Cancion3","Pepa",4);
		pistas[3]=new Podcast("Podcast1","Jordi",56);
		pistas[4]=new Podcast("Podcast2","Rafa", 24);

		for (int i=0;i<pistas.length;i++) {
			rep.cambiarReproducible(pistas[i]);
			rep.reproducirPlay();

		}
	}

}
