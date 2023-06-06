/*
 *Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba
acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.
 */
package ejemplorelaciones;

import ObjetoDni.Dni;
import ObjetoPersona.Persona;

/**
 *
 * @author thell
 */
public class EjemploRelaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona per=new Persona();
        per.setNombre("carlos");
        per.setApellido("gardel");
        per.setSexo("masculino");
        Dni dni=new Dni();
        dni.setPersona(per);
        dni.setNumero(3188888);
        dni.setSerie("A");
        System.out.println(dni.toString());
        
      
       
            
        
    }
    
}
