/*
 * Definir los siguientes métodos en AhorcadoService:
  char[] letras = new char[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            letras[i] = palabra.charAt(i);
        }
Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota: buscar como se usa el vector.length.
Método buscar(letra):  este método recibe una letra dada por el usuario y busca si la letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
Método encontradas(letra):  que reciba una letra ingresada por el usuario y muestre cuantas letras han sido encontradas y cuántas le faltan.
Este método además deberá devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se busque una letra que no esté, se le restará uno a sus oportunidades.
Método intentos(): para mostrar cuántas oportunidades le queda al jugador.
 */
package ServicioAhorcado;

import EntidadAhorcado.EntidadAhorcado;
import java.util.Scanner;

/**
 *
 * @author thell
 */
public class ServicioAhorcado {

    Scanner leer = new Scanner(System.in);
    EntidadAhorcado juego = new EntidadAhorcado();

    public EntidadAhorcado  crearJuego() {

        System.out.println("ingrese la palabra");
        String palabra =  leer.next();
         char[] letras = new char[palabra.length()];
       
        for (int i = 0; i < palabra.length(); i++) {
            
            letras[i] = palabra.charAt(i);
        }

        System.out.println("ingrese la cantidad de intentos");
        juego.setCantidadDeIntentos(leer.nextInt());

        return  juego;
    }

    public void largoDePalabra() {
        System.out.println("el largo de la palabra es: " + juego.getPalabraABuscar().length());

    }

}
