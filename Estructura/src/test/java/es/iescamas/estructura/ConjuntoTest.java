package es.iescamas.estructura;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConjuntoTest {
	

	@Test
    void testInsertarYNumeroElementos() {
        Conjunto c = new Conjunto();
        assertTrue(c.insertar(5));
        assertTrue(c.insertar(8));
        assertFalse(c.insertar(5));
        assertEquals(2, c.numeroElementos());
    }

    @Test
    void testPertenece() {
        Conjunto c = new Conjunto();
        c.insertar(10);
        assertTrue(c.pertenece(10));
        assertFalse(c.pertenece(99));
    }

    @Test
    void testEliminarElemento() {
        Conjunto c = new Conjunto();
        c.insertar(1);
        c.insertar(2);

        assertTrue(c.eliminarElemento(1));
        assertFalse(c.pertenece(1));
        assertEquals(1, c.numeroElementos());
    }

    @Test
    void testEliminarElementoNoExistente() {
        Conjunto c = new Conjunto();
        c.insertar(1);

        assertFalse(c.eliminarElemento(5));
        assertEquals(1, c.numeroElementos());
    }

    @Test
    void testAñadirElementosDe() {
        Conjunto c1 = new Conjunto();
        c1.insertar(1);
        c1.insertar(2);

        Conjunto c2 = new Conjunto();
        c2.insertar(2);
        c2.insertar(3);

        c1.añadirElementosDe(c2);

        assertEquals(3, c1.numeroElementos());
        assertTrue(c1.pertenece(1));
        assertTrue(c1.pertenece(2));
        assertTrue(c1.pertenece(3));
    }

    @Test
    void testEliminarTodos() {
        Conjunto c1 = new Conjunto();
        c1.insertar(1);
        c1.insertar(2);
        c1.insertar(3);

        Conjunto c2 = new Conjunto();
        c2.insertar(2);
        c2.insertar(3);

        c1.eliminarTodos(c2);

        assertEquals(1, c1.numeroElementos());
        assertTrue(c1.pertenece(1));
        assertFalse(c1.pertenece(2));
        assertFalse(c1.pertenece(3));
    }

    @Test
    void testMinimo() {
        Conjunto c = new Conjunto();
        c.insertar(5);
        c.insertar(2);
        c.insertar(8);

        assertEquals(2, c.minimo());
    }

    @Test
    void testMaximo() {
        Conjunto c = new Conjunto();
        c.insertar(5);
        c.insertar(2);
        c.insertar(8);

        assertEquals(8, c.maximo());
    }

    @Test
    void testMedia() {
        Conjunto c = new Conjunto();
        c.insertar(2);
        c.insertar(4);
        c.insertar(6);

        assertEquals(4.0, c.media());
    }

    @Test
    void testToString() {
        Conjunto c = new Conjunto();
        c.insertar(1);
        c.insertar(2);

        String s = c.toString();
        assertTrue(s.contains("1"));
        assertTrue(s.contains("2"));
    }

    @Test
    void testSecuenciaCompleta() {
        Conjunto c = new Conjunto();

        c.insertar(10);
        c.insertar(20);
        c.insertar(30);

        c.eliminarElemento(20);

        Conjunto otro = new Conjunto();
        otro.insertar(30);
        otro.insertar(40);

        c.añadirElementosDe(otro);

        assertEquals(3, c.numeroElementos());
        assertTrue(c.pertenece(10));
        assertTrue(c.pertenece(30));
        assertTrue(c.pertenece(40));
    }
    
    @Test
    void testIncluido() {
    	Conjunto c= new Conjunto();
    	Conjunto c2= new Conjunto();
    	c.insertar(2);
    	c.insertar(4);
    	c.insertar(6);
    	
    	c2.insertar(1);
    	c2.insertar(2);
    	c2.insertar(3);
    	c2.insertar(4);
    	c2.insertar(5);
    	c2.insertar(6);
    	c2.insertar(7);
    	
    	assertTrue(c.incluido(c, c2));
    }
    
    
    @Test
    void testIncluidoNull() {
    	Conjunto c=new Conjunto();
    	
    	NullPointerException ex= assertThrows(NullPointerException.class,()->c.incluido(null, c));
    	
    	c.insertar(2);
    	c.insertar(4);
    	c.insertar(6);
    	
    	String esp="Ningun conjunto puede ser null";
    	String res=ex.getMessage();
    	assertEquals(esp,res);
    	
    	
    }
}
