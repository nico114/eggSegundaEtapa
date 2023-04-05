/*
 * Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N,
con los valores ingresados por el usuario.

 */
package extrasguia4;

import java.util.Scanner;

/**
 *
 * @author thell
 */
public class ExtrasGuia4Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el tamaño del vector");
        int n=leer.nextInt();
        
        int [] vector = new int[n];
       // int resultado;
        for (int i = 0; i < n; i++) {
            System.out.println("ingrese " + n + " numeros");
         vector[i]= leer.nextInt();
         
           System.out.println("la suma de " + "[" +vector[i] + "]" + "[" + vector[i] + "]" + " es " +(vector[i]+ vector[i]));
        }
          
       
       
        
        
        
    }
    
}
