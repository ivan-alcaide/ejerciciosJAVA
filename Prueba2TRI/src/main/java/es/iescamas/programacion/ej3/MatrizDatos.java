package es.iescamas.programacion.ej3;

public class MatrizDatos implements OperableMatriz{

	private int[][] datos;
	
	public MatrizDatos(int[][] datos) {
		this.datos=datos;
	}

	
	
	@Override
	public int[][] sumar(int[][] otra) {
		
		if(otra==null || otra.length!=datos.length||otra[0].length!=datos[0].length) {
			throw new IllegalArgumentException("Matriz introducida imposible de sumar");
		}
		
		int[][] res=new int[otra.length][otra[0].length];
		for(int i=0;i<otra.length;i++) {
			for(int j=0;j<otra.length;j++) {
				res[i][j]=this.datos[i][j]+otra[i][j];
			}
		}
		this.datos=res;
		return res;
	}
	
	
	@Override
	public void mostrarResultado() {
		
		
		for(int i=0;i<datos.length;i++) {
			for(int j=0;j<datos.length;j++) {
				System.out.print(datos[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	public int[][] getDatos() {
		return datos;
	}

	public void setDatos(int[][] datos) {
		this.datos = datos;
	}

}
