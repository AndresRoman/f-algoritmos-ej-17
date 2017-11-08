/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias4;

/**
 *
 * @author hp
 */
public class AsignaturaDistancia extends Asignatura {
    private int numero_creditos;
      // Constructor
    public AsignaturaDistancia (int cred){
        super("Literatura", "Troncal", 300);
        establecer_numero_creditos(cred);
    }
    // Metodo set
    public void establecer_numero_creditos(int c){
        numero_creditos=c;
    }
    // Metodo get
    public int obtener_numero_creditos(){
        return numero_creditos;
    }
    // Metodo toString
    @Override
    public String toString(){
        String cadena = String.format("Asignatura Distancia:\n"
                + "%s\n"
                + "\tNumero creditos: %d\n", 
                super.toString(), obtener_numero_creditos());
        return cadena;
    }
}
