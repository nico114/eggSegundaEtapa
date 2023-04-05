

package ejerciciosClase3;

import java.util.Scanner;

/**
 *Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
 * Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*        *
*        *
* * * *

 * @author thell
 */
public class ejercicio8 {

  
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el tamaño de lineas del cuadrado");
        int linea = leer.nextInt();
        for (int i = 0; i < linea; i++) {
            for (int j = 0; j < linea; j++) {
                if (true) {
                    System.out.println(" *");
                }
                else { System.out.println("");
            }
            
        }
        
       
    }
    
}
}