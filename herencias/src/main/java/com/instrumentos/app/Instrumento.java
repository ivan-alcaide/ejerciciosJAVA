package com.instrumentos.app;

public abstract class Instrumento {
		protected final int MAX=100;
		protected nota[] melodia = new nota[MAX];
		protected int numNotas;
		
		

		
		
		public boolean add(nota n) {
			
			if(this.numNotas<this.MAX) {
				melodia[numNotas]=n;
				this.numNotas++;
				return true;
			}
			return false;
			
		}
		
		
		public abstract void interpretar();
		
}
