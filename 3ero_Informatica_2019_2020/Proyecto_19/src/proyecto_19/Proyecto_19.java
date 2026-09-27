/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_19;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Proyecto_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarar variables 
        int [] a=new  int[10];
        int [] b=new  int[10];
        int [] c=new  int[10];
        int [] d=new  int[10];
        
        int y,pos=0,neg=0;
        
        //Almacenar datos en el vector a
        Scanner teclado=new Scanner(System.in);
        System.out.println("Almacenar elementos en el vector A");
        for(y=0;y<=9;y++){
            System.out.print("Ingrese el numero en la posicion "+(y+1)+":");
        a[y]=teclado.nextInt();
    }
    System.out.println("");
    System.out.println("Trasladar y almacenar datos del vector A al vector B");
    for(y=0;y<=9;y++){
    b[y]=a[y];
}
    //Visualizar los datos del mvector B
    for(y=0;y<=9;y++){
        System.out.println("Elemento de la posicion"+(y+1)+":"+b[y]); 
    }
    //Comprobar si elementos del vector B, son positivos o negativo, contabiulizar
    for(y=0;y<=9;y++){
        if (b[y]>0){
             c[pos]=b[y];
             pos=pos+1;      // Contabiliza los numeros positivos 
                                    // Posicion del elemento en el vector c
             
             if (b[y]>0){
             d[neg]=b[y];
             neg=neg+1;      // Contabiliza los numeros negativos
                                    // Posicion del elemento en el vector c
             
    }
     
               //Visualizar elementos del vector c y d
        
        }