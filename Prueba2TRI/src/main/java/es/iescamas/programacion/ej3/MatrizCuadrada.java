package es.iescamas.programacion.ej3;

public class MatrizCuadrada extends MatrizDatos{

	public MatrizCuadrada(int[][] datos) {
		super(datos);
	}

	@Override
	public void mostrarResultado() {
		super.mostrarResultado();
		System.out.println();
		System.out.println("Tamaño de la matriz: "+ super.getDatos().length+" X "+super.getDatos()[0].length);
	}
}
