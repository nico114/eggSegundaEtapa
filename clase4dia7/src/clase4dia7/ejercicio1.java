/*
 * Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, restar, multiplicar y dividir.
La aplicación debe tener una función para cada operación matemática y deben devolver sus resultados para imprimirlos en el main.
 */
package clase4dia7;

import java.util.Scanner;

/**
 *
 * @author thell
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese los numeros");
        int num1=leer.nextInt();
        int num2=leer.nextInt();

        System.out.println("---------- MENU ----------");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.print("Ingrese una Opción:");
        int opcion = leer.nextInt();
        do {   
            
            if (opcion == 1) 
            {
                System.out.println("la suma de los numeros es " );
                
            }
            if (opcion ==2) 
            {
                System.out.println("la resta de los numeros es ");   
            }
            if (opcion ==3) 
            {
                System.out.println("la multiplicacion  de los numeros es ");   
            }
            if (opcion ==4) 
            {
                System.out.println("la divicion de los numeros es ");   
            }
            if (opcion == 5)
            {
                System.out.println("gracias vuelvas prontos");
            
            
            
            
            
        } while (opcion != 5);
        
 
        

        


        
        }
        
 
        
        }
}

    