/*
 * Realizar un programa que simule el funcionamiento de un dispositivo RS232
, este tipo de dispositivo lee cadenas enviadas por el usuario.
Las cadenas deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo,
el primer carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas,
la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE),
y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e incorrectas recibidas.
Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().

 */
package dia6guia3;

import java.util.Scanner;

/**
 *
 * @author thell
 */
public class Dia6Guia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String cadena;
        int contadorCorrecto=0;
        int contadorIncorrecto=-1;
        
        do {  
            
            System.out.println("por favor ingrese una palabra de 5 letras ,ingrese &&&&& para salir");
           
            cadena = leer.nextLine();
          
            
            if (cadena.length() 5 && cadena.charAt(0) == "x" && cadena.charAt(4) == "o") 
            {
                contadorCorrecto++;
                
            } else
            {
                contadorIncorrecto++;
            }  
            
            
            
        } while (  !"&&&&&".equals(cadena));
        
        System.out.println("la cantidad de palabras correctas es: " + contadorCorrecto );
        System.out.println("la cantidad de palabras incorrectas es: " + contadorIncorrecto);
        
        
        
        
        
        
    }
    
}
