package institucion;

/**
 * Autor: Andres Roman
 * Fecha: 18/10/2017
 */
public class Asignatura {
    private String nombre;
    private int creditos;
    // Metodos set y get
    public void establecer_nombre(String nom){
        nombre=nom;
    }
    public String obtener_nombre(){
        return nombre;
    }
    public void establecer_creditos(int creds){
        creditos = creds;
    }
    public int obtener_creditos(){
        return creditos;
    }
    @Override
    public String toString(){
        String cadena = String.format("%s con numero de creditos %d", obtener_nombre(), obtener_creditos());
        return cadena;
    }
}
