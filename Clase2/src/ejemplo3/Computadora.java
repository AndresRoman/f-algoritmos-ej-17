package ejemplo3;

/**
 * Autor: Andres Roman
 * Fecha: 13/10/2017 
 */
public class Computadora {
    // Atributos o variables
    private double velocidad_procesador;
    // Metodo set
    public void establecer_velocidad_procesador (double velocidad){
        if (velocidad>5) {
            velocidad_procesador=5;
        }else{
            velocidad_procesador = velocidad;           
        }
    }
    // Metodo get
    public double obtener_velocidad_procesador (){        
        return velocidad_procesador;
    }
    // Metodo toString
    @Override
    public String toString(){
        String cadena = String.format("Computadora con\n" + "velocidad %.2f", obtener_velocidad_procesador());
        return cadena;
    }
}
