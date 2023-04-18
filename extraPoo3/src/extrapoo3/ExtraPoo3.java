/*
 * Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos jugadores jugar un juego de adivinanza de números.
El primer jugador elige un número y el segundo jugador intenta adivinarlo.
El segundo jugador tiene un número limitado de intentos y recibe una pista de "más alto" o "más bajo" después de cada intento.
El juego termina cuando el segundo jugador adivina el número o se queda sin intentos.
Registra el número de intentos necesarios para adivinar el número y el número de veces que cada jugador ha ganado.

 */
package extrapoo3;

import java.util.Scanner;

/**
 *
 * @author thell
 */
public class ExtraPoo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      atributosJuego juego= new atributosJuego();
     String respuesta;
      do{ 
          
      
      juego.cargarDatos();
        Scanner leer = new Scanner(System.in);
        int contIntentos=0;
        int contVictorias=0;
        for (int i = 0; i < juego.intentos; i++) {
            
            System.out.println("adivine el numero ");
            int num1=leer.nextInt();
             contIntentos++;
            if (num1!=juego.num) {
               
                if (num1<juego.num) {
                    System.out.println("el numero ingresado es menor");
                    
                }else{
                    System.out.println("el numero ingresado es mayor");
 
                }
                System.out.println("vuelva aintentar te quedan " +i+ " intentos");
                
            }else{
                System.out.println("felicitaciones lo descubriste en " + contIntentos + " intentos");
                contVictorias++;
                break;     
                
            }
            
           
                        
            }
          System.out.println("quiere seguir, si o no?");
          
          respuesta=leer.next();
            
          System.out.println("ganaste " + contVictorias + " veces");
   
      }
      
      while("si".equalsIgnoreCase(respuesta)==true);
      
        
        System.out.println("GAME OVER!!!!!!");
      
            
        
            
     
      }
      }

      
  

      
              
    

