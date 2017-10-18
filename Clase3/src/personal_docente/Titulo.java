package personal_docente;

/**
 * Autor: Andres Roman
 * Fecha: 18/10/2017
 */
public class Titulo {
    private String nombre;
    private String nombre_universidad;
    // Metodos set
    public void establecer_nombre(String nom){
        nombre = nom;
    }    
    public void establecer_nombre_universidad(String nomU){
        nombre_universidad = nomU;
    }
    // Metodos get
    public String obtener_nombre(){
        return nombre;
    }    
    public String obtener_nombre_universidad(){
        return nombre_universidad;
    }
    // Metodo toString
    @Override
    public String toString(){
        String cadena = String.format("%s - %s", obtener_nombre(), obtener_nombre_universidad());
        return cadena;
    }
}
