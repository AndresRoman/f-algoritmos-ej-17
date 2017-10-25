package clase4;

/**
 * Autor; Andres Roman
 * Fecha: 25/10/2017
 */
public class Principal {

    public static void main(String[] args) {
        // Constructor por defecto
        Carrera c = new Carrera();
        c.establecer_nombre("Informatica");
        c.establecer_modalidad("Distancia");
        System.out.println(c);
        // Constructor con 1 parametro
        Carrera c2 = new Carrera("Electronica");
        System.out.println(c2.obtener_modalidad());
        // Constructor con 2 parametros
        Carrera c3 = new Carrera("semipresencial", "Sistemas");
        System.out.println(c3.obtener_modalidad());
        c3.establecer_modalidad("distancia");
        System.out.println(c3.obtener_modalidad());
        c3.establecer_modalidad(c3.obtener_modalidad().toUpperCase());
        System.out.println(c3.obtener_modalidad());
    }
    
}
