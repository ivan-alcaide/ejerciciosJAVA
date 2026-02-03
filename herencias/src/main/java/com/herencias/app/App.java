package com.herencias.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	Hora h=new Hora(3,59);
    	
    	System.out.println(h.toString());
    	
    	h.inc();
    	
    	System.out.println(h.toString());
    	
    	
    	
    	Hora12 h12=new Hora12(12,53,Periodo.AM);
    	
    	h12.inc();
    	
    	System.out.println(h12.toString());
    	
    	
    	
    	HoraExacta hE = new HoraExacta(23,59,59);
    	
    	hE.inc();
    	
    	System.out.println(hE.toString());
    }
}
