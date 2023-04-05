/*
 *Escriba un programa que averigüe si dos vectores de N enteros son iguales
(la comparación deberá detenerse en cuanto se detecte alguna diferencia entre los elementos)
 */
package extrasguia4;

import java.util.Scanner;

/**
 *
 * @author thell
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int [] vector1 = new int[3];
        int [] vector2 = new int[3];
        boolean bandera = false;
       do { 
        for (int i = 0; i < vector1.length; i++) {
            System.out.println("ingrese la " + (i+1) + " ° posicion en el primer vector");
            vector1[i]=leer.nextInt();
           
            
        }
        for (int j = 0; j < vector2.length; j++) {
             System.out.println("ingrese la " + (j+1) + " ° posicion del segundo vector");
            vector2[j]=leer.nextInt();
            
        }
       for(int mostrar : vector1){
           System.out.print("[" + mostrar + "]");
        
         
            
        }
       System.out.println(" ");
        for (int mostrar2 : vector2) {
            
        
      
            System.out.print("[" + mostrar2 + "]");
        }
         
      
        bandera = vector1 == vector2;
                   
            System.out.println("los vectores son iguales");
        } while (!bandera==false);
}
}
    

