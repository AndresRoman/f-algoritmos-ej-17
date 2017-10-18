package paquete_principal;
// Importacion de paquetes
import personal_docente.Docente;
import institucion.Asignatura;
import personal_docente.Titulo;
/**
 * Autor: Andres Roman
 * Fecha: 18/10/2017
 */
public class Principal {

    public static void main(String[] args) {
        // Se crean la asignatura_1
        Asignatura a1 = new Asignatura();
        a1.establecer_nombre("Matematicas");
        a1.establecer_creditos(8);
        // Se crea la asignatura_2
        Asignatura a2 = new Asignatura();
        a2.establecer_nombre("Física");
        a2.establecer_creditos(6);
        // Se crea el titulo_tercer_nivel
        Titulo t3 = new Titulo();
        t3.establecer_nombre("Licenciado en Físico Matemáticas");
        t3.establecer_nombre_universidad("Universidad Politécnica");
        // Se cre el titulo_cuarto_nivel
        Titulo t4 = new Titulo();
        t4.establecer_nombre("Magister en Docencia Matemática");
        t4.establecer_nombre_universidad("Universidad Valenciana");
        // Se crean los objetos docentes
        Docente d1 = new Docente();
        d1.establecer_nombres("Luis V.");
        d1.establecer_apellidos("Perez J.");
        d1.establecer_asignatura_1(a1);
        d1.establecer_asignatura_2(a2);
        d1.establecer_titulo_tercer_nivel(t3);
        d1.establecer_titulo_cuarto_nivel(t4);
        System.out.println(d1);
    }
    
}
