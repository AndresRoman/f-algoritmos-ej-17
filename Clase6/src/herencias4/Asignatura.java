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
public class Asignatura {
    private String nombre;
    private String tipo;
    private double costo;
    // Costructor
    public Asignatura(String n, String t, double c){
        establecer_nombre(n);
        establecer_tipo(t);
        establecer_costo(c);
    }
    // Metodos set
    public void establecer_nombre(String nom){
        nombre=nom;
    }
    public void establecer_tipo(String t){
        tipo=t;
    }
    public void establecer_costo(double c){
        costo=c;
    }
    // Metodos get
    public String obtener_nombre(){
        return nombre;
    }
    public String obtener_tipo(){
        return tipo;
    }
    public double obtener_costo(){
        return costo;
    }
    // Metodo toString
    @Override
    public String toString(){
        String cadena = String.format("\t%s\n"
                + "\t%s\n"
                + "\t$ %.2f",
                obtener_nombre(), obtener_tipo(), obtener_costo());
        return cadena;
    }
}
