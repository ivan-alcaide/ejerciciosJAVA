package es.dni;

import java.util.Random;

import com.github.javafaker.Faker;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )   {
       ControladorDNI controlador = new ControladorDNI();
       String test = controlador.generarAleatorioDNI();
       System.out.println(test);
    }
}
