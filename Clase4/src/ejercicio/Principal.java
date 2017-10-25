package ejercicio;
/**
 * Autor; Andres Roman
 * Fecha: 25/10/2017
 */
public class Principal {
    public static void main(String[] args) {
        // Carrera 1, Asignatura 1
        Carrera c = new Carrera("Contabilidad", "presencial");
        Asignatura a = new Asignatura(c);
        System.out.println(a+"\n");
        // Carrera 1, Asignatura 1
        Carrera c2 = new Carrera("Economia", "distancia");
        Asignatura a2 = new Asignatura(c2);
        System.out.println(a2+"\n");
    }
}
