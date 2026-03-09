package Pagos;

public class Main {

	public static void main(String[] args) {
		
		Bizum b=new Bizum(100,643671489);
		Efectivo E=new Efectivo(50);
		Tarjeta T=new Tarjeta(300,200);
		Tarjeta T2=new Tarjeta(200,300);
		
		Caja c1=new Caja();
		
		//bizum
		System.out.println(c1.cobrar(b, 120));
		System.out.println();
		System.out.println(c1.cobrar(b, 90));
		System.out.println();
		System.out.println(c1.cobrar(b, 10));
		System.out.println();
		System.out.println();
		
		
		//tarjeta
		System.out.println(c1.cobrar(T, 250));
		System.out.println();
		System.out.println(c1.cobrar(T2, 250));
		System.out.println();
		System.out.println(c1.cobrar(T, 150));
		System.out.println();
		System.out.println(c1.cobrar(T2, 200));
		System.out.println();
		System.out.println();
		
		
		//efectivo
		System.out.println(c1.cobrar(E, 60));
		System.out.println();
		System.out.println(c1.cobrar(E, 30));
		System.out.println();
		System.out.println(c1.cobrar(E, 20));
	}
	
}
