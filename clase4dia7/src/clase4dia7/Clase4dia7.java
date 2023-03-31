/*
 * Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada en punto
, y luego codifique la palabra o frase ingresada de la siguiente manera
: cada vocal se reemplaza por el carácter que se indica en la tabla y el resto de los caracteres
(incluyendo a las vocales acentuadas) se mantienen sin cambios.

 */
package clase4dia7;

import java.util.Scanner;

/**
 *
 * @author thell
 */
public class Clase4dia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("ingrese una frase y que termine en punto");
        String frase = leer.nextLine();
        System.out.println("su frase es: " + frase);
        
        String retorno=reemplazo(frase);
        System.out.println("su nueva frase es " + retorno);
        
        
        
    }
    public static String reemplazo (String frase)  {
      String frase2;
      frase2 = frase.replace("a", "@").replace("e", "#").replace("i", "$").replace("o", "%").replace("u", "*");
        
        return frase2;
        
        
    }
    
    
}
