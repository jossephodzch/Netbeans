
package proyecto_3_entrada_datos;

import java.util.Scanner;

public class Proyecto_3_Entrada_Datos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Definir Variables
        int pn, sn, tn;
        String nom;
        
        //Declarar o invocar la clase Scanner
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingreso de datos numéricos");
        System.out.print("");
        System.out.print("Ingrese el primer número: ");
        pn=entrada.nextInt();
        System.out.print("Ingrese el segundo número: ");
        sn=entrada.nextInt();
        System.out.print("Ingrese el tercer número: ");
        tn=entrada.nextInt();
        System.out.print("");
        System.out.print("Elaborado por: ");
        nom=entrada.next();
        
    }
    
}
