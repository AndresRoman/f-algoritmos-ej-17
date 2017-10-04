package tablamultiplicar;
import java.util.Scanner;
/**
 * Autor: Andres Roman
 * Fecha: 04/10/2017
 */
public class TablaMultiplicar {
    public static void main(String[] args) {
        // Scanner para entrada de datos
        Scanner datos = new Scanner(System.in);
        // Variables
        int num=0, i=0, multi=0;
        // Entrada
        System.out.println("Ingrese el numero");
        num=datos.nextInt();
        // Proceso
        for (i=1;i<=12;i++){
            multi=num*i;
            System.out.println(+num+"x"+i+"="+multi); 
        }
    }
    
}
