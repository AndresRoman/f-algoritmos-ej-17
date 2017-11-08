/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;

/**
 *
 * @author hp
 */
public class Profesor extends Persona {
    private double sueldo;
    // Constructores
    public Profesor(){
        super("Antonio", "Velez", 28);
        establecer_sueldo(1200.54);
        
    }
    public Profesor (double s){
        super("Rene", "Elizalde", 34);
        establecer_sueldo(s);
    }
    public Profesor (String n, String a, int e, double s){
        super(n, a, e);
        establecer_sueldo(s);
    }
    //Metodo set
    public void establecer_sueldo(double s){
        sueldo=s;
    }
    public void setEdad (int e){
        if(e<30){
            edad=30;
        }else{
            edad=e;
        }
    }
    // Metodo get
    public double obtener_sueldo(){
        return sueldo;
    }
}
