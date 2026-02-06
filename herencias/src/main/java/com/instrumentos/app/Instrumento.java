package com.instrumentos.app;

public abstract class Instrumento {
		protected final int MAX=100;
		protected nota[] melodia;
		protected int numNotas;
		
		
		public Instrumento(nota[] melodia) {
			if(melodia.length>this.MAX) {
				throw new IllegalArgumentException("El máximo de notas es 100");
			}
			this.numNotas=melodia.length;
			this.melodia=melodia;
		}
		
		
		public boolean add(nota n) {
			
			if(this.numNotas<this.MAX) {
				this.numNotas++;
				this.melodia=new nota[melodia.length+1];
				melodia[numNotas]=n;
				return true;
			}
			return false;
			
		}
		
		
		public abstract void interpretar();
		
}
