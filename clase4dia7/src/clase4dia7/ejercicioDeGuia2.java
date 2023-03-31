/*
 *Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario,
validando que el primer número múltiplo del segundo e imprima si el primer número es múltiplo del segundo,
sino informe que no lo son.

 */
package clase4dia7;

import java.util.Scanner;

/**
 *
 * @author thell
 */
public class ejercicioDeGuia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
        System.out.println("ingrese dos  numeros para saber si son multiplos"); 
        int num1=leer.nextInt();
        int num2=leer.nextInt();
        
        multiplo(num1, num2);
        
              
      
    }
    public static void multiplo(int num1, int num2) {
        if (num1 % num2 == 0) {
            System.out.println("es multiplo");
            
        }else {
            System.out.println("no es multiplo");
        }
        
    }
    
}
