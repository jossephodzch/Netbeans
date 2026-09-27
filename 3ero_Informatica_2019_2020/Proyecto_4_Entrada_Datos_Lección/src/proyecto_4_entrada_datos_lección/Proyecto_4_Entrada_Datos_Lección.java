
package proyecto_4_entrada_datos_lección;

import java.util.Scanner;


public class Proyecto_4_Entrada_Datos_Lección {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //Definir variables
        int p1, p2, p3, sum;
        String nom;
        
        //Declarar o invocar la clase Scanner
        Scanner entrada=new Scanner(System.in);
        System.out.print("Realizar un proyecto que permita ingresar tres númer"
                + "os por teclado, el nombre y calcular la suma y visualizar");
        System.out.println("");
        System.out.print("Ingrese el primer número: ");
        p1=entrada.nextInt();
        System.out.print("Ingrese el segundo número: ");
        p2=entrada.nextInt();
        System.out.print("Ingrese el tercer número: ");
        p3=entrada.nextInt();
        sum=p1+p2+p3;
        System.out.print("La suma es: "+sum);
        System.out.print(" Elaborado por: ");
        nom=entrada.nextLine();
        
        
        
        
        
        
        
        
        
    }
    
}
