/*
 *Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba
acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.
 */
package ejemploparamartin;

import Service.Servicios;

/**
 *
 * @author thell
 */
public class EjemploParaMartin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Servicios s = new Servicios();
                s.llenarPersona();
                s.mostrarArray();
        
        
        
    }
    
}
