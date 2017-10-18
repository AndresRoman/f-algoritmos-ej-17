package personal_docente;
import institucion.Asignatura;
/**
 * Autor: Andres Roman
 * Fecha: 18/10/2017
 */
public class Docente {
    private String nombres;
    private String apellidos;
    private Titulo titulo_tercer_nivel;
    private Titulo titulo_cuarto_nivel;
    private Asignatura asignatura_1;
    private Asignatura asignatura_2;
    // Metodos set
    public void establecer_nombres(String nom){
        nombres=nom;
    }
    public void establecer_apellidos(String apes){
        apellidos=apes;
    }
    public void establecer_titulo_tercer_nivel(Titulo titulo3){
        titulo_tercer_nivel=titulo3;
    }
    public void establecer_titulo_cuarto_nivel(Titulo titulo4){
        titulo_cuarto_nivel=titulo4;
    }
    public void establecer_asignatura_1(Asignatura asig1){
        asignatura_1=asig1;
    }
    public void establecer_asignatura_2(Asignatura asig2){
        asignatura_2=asig2;
    }
    // Metodos get
    public String obtener_nombres(){
        return nombres;
    }
    public String obtener_apellidos(){
        return apellidos;
    }
    public Titulo obtener_titulo_tercer_nivel(){
        return titulo_tercer_nivel;
    }
    public Titulo obtener_titulo_cuarto_nivel(){
        return titulo_cuarto_nivel;
    }
    public Asignatura obtener_asignatura_1(){
        return asignatura_1;
    }
    public Asignatura obtener_asignatura_2(){
        return asignatura_2;
    }
    // Metodo toString
    @Override
    public String toString(){
        String cadena = String.format("Datos del docente:"
                + "\nNombres: %s"
                + "\nApellidos: %s"
                + "\nTiene a su cargo las asignaturas: "
                + "\nAsignatura 1: %s"
                + "\nAsignatura 2: %s"
                + "\nEl docente tiene los siguientes titulos academicos:"
                + "\nTitulo 3er nivel: %s"
                + "\nTitulo 4to nivel: %s", nombres, apellidos, obtener_asignatura_1(), obtener_asignatura_2(), obtener_titulo_tercer_nivel(), obtener_titulo_cuarto_nivel());
        return cadena;
    }
}    
    
