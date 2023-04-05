/*
 *
 */
package EjerciciosGuia5;

import java.util.Scanner;

/**
 *
 * @author thell
 */
public class ejrcicio6 {

  
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
