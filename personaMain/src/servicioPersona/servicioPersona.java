/*
 * En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.

Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al usuario
y después se le asignan a sus respectivos atributos para llenar el objeto Persona.

Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje


Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)).
Si esta fórmula da por resultado un valor menor que 20, significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona está en su peso ideal y la función devuelve un 0.
Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la función devuelve un 1.

 */
package servicioPersona;

import java.util.Scanner;
import personamain.entidadPersona.EntidadPersona;

/**
 *
 * @author thell
 */
public class servicioPersona {

    Scanner leer = new Scanner(System.in);
    EntidadPersona persona = new EntidadPersona();

    public EntidadPersona llenarPersona() {

        System.out.println("ingrese el nombre");
        persona.setNombre(leer.nextLine());
        System.out.println("ingrese la edad");

        System.out.println("ingrese el sexo,ingrese f para fem, m para masc y o para otros");
        persona.setSexo(leer.nextLine());
        if (!"f".equalsIgnoreCase(persona.getSexo()) || !"m".equalsIgnoreCase(persona.getSexo()) || !"o".equalsIgnoreCase(persona.getSexo())) {
            System.out.println("ingrese sexo correcto");
        }

        System.out.println("ingrese el peso");
        persona.setPeso(leer.nextDouble());
        System.out.println("ingrese la altura");
        persona.setAltura(leer.nextDouble());

        return persona;

    }

    public boolean esMayorDeEdad(EntidadPersona persona) {

        persona.setEdad(leer.nextInt());
        return persona.getEdad() >= 18 ;
    }


//    Método calcularIMC()
//
//    : calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)).
//Si esta fórmula da por resultado un valor menor que 20, significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
//Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona está en su peso ideal y la función devuelve un 0.
//Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la función devuelve un 1.

public int CalcularImb(EntidadPersona persona) {
      
//
        

        double indice = persona.getPeso() / (Math.pow(persona.getAltura(), 2));
        if (indice < 20) {
           return -1;

        } else if (indice >= 20 && indice <= 25) {
            return 0;
        } else {
           return 1;
        }

 

}
}