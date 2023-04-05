/*
 * Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package EjerciciosGuia5;

import java.util.Scanner;

/**
 *
 * @author thell
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el tamaño del vector");
        int n = leer.nextInt();
        
        int [] vector = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("ingrese " + n + "  numeros de hasta 5 cifras");
            
            vector[i] = leer.nextInt();
               int digitos = String.valueOf(vector[i]).length();
    if (digitos <= 5) {
        vector[digitos - 1]++;
           
        }
            for (int j = 0; j < n; j++) {
                
                System.out.println("el numero " + (i+1)+ " tiene " + vector[i] + " digitos");
            }
        
         
        
        }
    }
}


