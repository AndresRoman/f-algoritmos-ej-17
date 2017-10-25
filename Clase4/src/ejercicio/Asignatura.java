package ejercicio;
/**
 * Autor; Andres Roman
 * Fecha: 25/10/2017
 */
public class Asignatura {
    private String nombre;
    private int creditos;
    private Carrera carrera;
    // Constructor
    public Asignatura (Carrera nom){
        carrera=nom;
        nombre="Informatica";
        creditos=5;
    }
    // Metodos set
    public void establecer_nombre(String nom){
        nombre=nom;
    }
    public void establecer_creditos(int cred){
        creditos=cred;
    }
    public void establecer_carrera(Carrera carr){
        carrera=carr;
    }
    // Metodos get
    public String obtener_nombre(){
        return nombre;
    }
    public int obtener_creditos(){
        return creditos;
    }
    public Carrera obtener_carrera(){
        return carrera;
    }
    
    // Metodo toString
    @Override
    public String toString(){
        String cadena = String.format("Asignatura \n"
                                    + "Nombre: %s \n"
                                    + "Creditos: %d \n"
                                    + "%s", obtener_nombre(), obtener_creditos(), obtener_carrera());
        return cadena;
    }
}
