package ejemplo1;

/**
 * Autor: Andres Roman
 * Fecha: 13/10/2017
 */
public class Ejemplo {
    public static void main(String[] args) {
        // Creacion del objeto
        Computadora c = new Computadora();
        System.out.println(c.velocidad_procesador);
        c.velocidad_procesador = 10.2;
    }    
}
