package com.caja.app;

public class  Caja {
		protected final int ancho;
		protected final int alto;
		protected final int fondo;
		protected final Unidades u;
		
		
		
		public Caja(int ancho,int alto, int fondo, Unidades u) {
			this.ancho=ancho;
			this.alto=alto;
			this.fondo=fondo;
			this.u=u;

		}
		
		
		public double getVolumen() {
			int ancho,alto,fondo;
			if(this.u.equals(Unidades.cm)) {
				ancho=this.ancho*100;
				alto=this.alto*100;
				fondo=this.fondo*100;
			}else {
				ancho=this.ancho;
				alto=this.alto;
				fondo=this.fondo;
			}
			
			int volumen=ancho*alto*fondo;
			
			return volumen;
			
		}
		
		public String toString() {
			return "La anchura de la caja es de " + this.ancho + " " + this.u + ", la altura es de " + this.alto + " " + this.u + " y el fondo es de " + this.fondo + " " + this.u ;
		}
}
