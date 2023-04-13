/*
 * Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos jugadores jugar un juego de adivinanza de números.
El primer jugador elige un número y el segundo jugador intenta adivinarlo.
El segundo jugador tiene un número limitado de intentos y recibe una pista de "más alto" o "más bajo" después de cada intento.
El juego termina cuando el segundo jugador adivina el número o se queda sin intentos.
Registra el número de intentos necesarios para adivinar el número y el número de veces que cada jugador ha ganado
 */
package extrapoo3;

import java.util.Scanner;

/**
 *
 * @author thell
 */
public class atributosJuego {
    public int num;
    public int intentos;

    public atributosJuego(int num, int intentos) {
        this.num = num;
        this.intentos=intentos;
    }

    public atributosJuego() {
    }
    public void cargarDatos(){
        Scanner leer = new Scanner(System.in);
        System.out.println("bienvenido al juego");
        System.out.println("elija un numero");
        this.num=leer.nextInt();
        System.out.println("elija cantidad de intentos");
        this.intentos=leer.nextInt();
    }
   
    
}
