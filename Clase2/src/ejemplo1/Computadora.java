package ejemplo1;

/**
 * Autor: Andres Roman
 * Fecha: 13/10/2017 
 */
public class Computadora {
    // Atributos
    private double velocidad_procesador;
    // Metodo set
    public void establecer_velocidad_procesador (double velocidad){
        velocidad_procesador = velocidad;
    }
    // Metodo get
    public double obtener_velocidad_procesador (){        
        return velocidad_procesador;
    }
}
