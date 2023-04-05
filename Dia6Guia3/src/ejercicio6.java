
import java.util.Scanner;

/*
 * 
 * / *
 * 
 */
public class ejercicio6 {
//
//    Realizar un programa que pida dos números enteros positivos por teclado y muestre por pantalla el siguiente menú
//            :El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla y luego volver al menú.
//            El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta que, si el usuario selecciona la opción 5
//            en vez de salir del programa directamente, se debe mostrar el siguiente mensaje de confirmación:
//            ¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa,
//                    caso contrario se vuelve a mostrar el menú.

    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese dos numeros enteros");
        int num1= leer.nextInt();
        int num2= leer.nextInt();
        String opcion;
        
        do {  
            
            
                    System.out.println("---------- MENU ----------");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.print("Ingrese una Opción:");
            opcion=leer.nextLine();
            
            
            
             

switch (opcion) {
                    case "1" -> System.out.println("la suma de los numeros es " + ( num1+num2));
                    case "2" -> System.out.println("la resta " + (num1-num2));
                    case "3" -> System.out.println("el resultado de la multiplicacion es " + (num1*num2) );
                    case "4" -> System.out.println("el resultado de la division es " + (num1/num2));
                    case "5" -> {
                        System.out.println("esta seguro s/n?");
                       
                        if (opcion.equals("s"))
                        {
                            System.out.println("gracias por participar");
                        }
                }
                }
                
                
                
                
                
                
                
                
                
            } while ( ! "s".equalsIgnoreCase(opcion));
            
            
            
            
            
            
       
        
        
    }
    
}
