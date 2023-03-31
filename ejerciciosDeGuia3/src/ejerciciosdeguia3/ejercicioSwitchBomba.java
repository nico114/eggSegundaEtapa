/*
Ejercicio 7
Considera que estás desarrollando una web para una empresa que fabrica motores (suponemos que se trata del tipo de motor de una bomba para mover fluidos). Definir una variable tipoMotor y permitir que el usuario ingrese un valor entre 1 y 4. El programa debe mostrar lo siguiente:
o	Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una bomba de agua”.
o	Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una bomba de gasolina”.
o	Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una bomba de hormigón”.
o	Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una bomba de pasta alimenticia”.
o	Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No existe un valor válido para tipo de bomba”

 */
package ejerciciosdeguia3;

import java.util.Scanner;


public class ejercicioSwitchBomba {

 
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenidos a bombin hermanos");
       
        int opcion;

    	System.out.println("Ingrese una opcion");

    	opcion = leer.nextInt();


        switch (opcion) {
            case 1 -> System.out.println("La bomba es una bomba de agua");
            case 2 -> System.out.println("La bomba es una bomba de gasolina");
            case 3 -> System.out.println("La bomba es una bomba de hormigón");
            case 4 -> System.out.println("La bomba es una bomba de pasta alimenticia");
           
                
            default -> System.out.println("No existe un valor válido para tipo de bomba");
        }
        
      
    }
    
}
