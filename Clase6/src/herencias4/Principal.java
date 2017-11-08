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
public class Principal {
    public static void main (String[] args){
        // Objetos
        AsignaturaPresencial a1 = new AsignaturaPresencial("Programacion", "Comun", 100, 180);
        System.out.println(a1);
        
        AsignaturaDistancia a2 = new AsignaturaDistancia(6);
        System.out.println(a2);
    }
}
