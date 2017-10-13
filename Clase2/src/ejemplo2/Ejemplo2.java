package ejemplo2;

/**
 * Autor: Andres Roman
 * Fecha: 13/10/2017
 */
public class Ejemplo2 {
    public static void main(String[] args) {
        // Creacion del objeto
        Computadora c = new Computadora();
        // Llamada al metodo
        System.out.println(c.obtener_velocidad_procesador());
        c.establecer_velocidad_procesador(4.9);
        System.out.println(c.obtener_velocidad_procesador());
    }    
}
