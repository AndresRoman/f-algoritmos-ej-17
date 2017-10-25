package ejercicio;
/**
 * Autor; Andres Roman
 * Fecha: 25/10/2017
 */
public class Carrera {
    private String nombre;
    private String modalidad;
    // Costructor
    public Carrera(String md, String n){
        modalidad = md;
        nombre = n;
    }
    // Metodos set
    public void establecer_nombre(String n){
        nombre = n;
    }    
    public void establecer_modalidad(String n){
        modalidad = n;
    }
    // Metodos get
    public String obtener_nombre(){
        return nombre;
    }
    public String obtener_modalidad(){
        return modalidad;
    }
    // Metodo toString
    @Override
    public String toString(){
        String cadena = String.format("Carrera: %s\n"
                + "Modalidad: %s",
                obtener_modalidad(), obtener_nombre());
        return cadena;
    }
}
