/*
 *Programa Nespresso. Desarrolle una clase Cafetera en el paquete Entidades con
los atributos capacidadMáxima (la cantidad máxima de café que puede contener la cafetera) y 
cantidadActual (la cantidad actual de café que hay en la cafetera).
Agregar constructor vacío y con parámetros así como setters y getters.
Crear clase CafeteraServicio en el paquete Servicios con los siguiente:
Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
Método servirTaza(int): se pide el tamaño de una taza vacía,
el método recibe el tamaño de la taza y simula la acción de servir la taza con la capacidad indicada.
Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede.
El método le informará al usuario si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.
Método vaciarCafetera(): pone la cantidad de café actual en cero. 
Método agregarCafe(int): se le pide al usuario una cantidad de café,
el método lo recibe y se añade a la cafetera la cantidad de café indicada.
 */
package servicioCafetera;

import java.util.Scanner;
import poocafetera.entidad.entidadCafetera;

/**
 *
 * @author thell
 */
public class servicioCafetera {

    Scanner leer = new Scanner(System.in);
    entidadCafetera cafetera1 = new entidadCafetera();

    public void llenarCafetera() {

        System.out.println("ingrese la cantidad de cafe en la cafetera en mililitros");
        cafetera1.setCapMaxima(leer.nextInt());

    }

    public void llenarTaza() {
        int tamaño;

        System.out.println("indique el tamaño de la taza en mililitros");
        tamaño = leer.nextInt();
        System.out.println("quiere llenar su taza?");

        if (tamaño < cafetera1.getCapMaxima()) {

            cafetera1.setCapMinima(cafetera1.getCapMaxima() - tamaño);

            System.out.println("le queda " + cafetera1.getCapMinima() + " ml de cafe");
            System.out.println("disfrute su cafe");
        } else {
            System.out.println("le queda " + (cafetera1.getCapMaxima() - tamaño) + " ml de  cafe");
            cafetera1.setCapMinima(0);

        }
    }
    //Método vaciarCafetera(): pone la cantidad de café actual en cero.

    public void vaciarCafetera() {
        System.out.println("");
        cafetera1.setCapMinima(0);
        
    }

    public void agregarCafe() {

        System.out.println("cuanto cafe quiere agregar");
        cafetera1.setCapMinima(cafetera1.getCapMinima() + (leer.nextInt()));
        System.out.println("cargo " + cafetera1.getCapMinima() + " ml de cafe" + cafetera1.getCapMinima() );
    }

}
