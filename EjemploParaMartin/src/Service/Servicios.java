/*
 Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba
acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.
 */
package Service;

import entidad.Dni;
import entidad.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author thell
 */
public class Servicios {
  ArrayList<Persona>listaDePersonas=new ArrayList();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");;
    public Persona llenarPersona(){
          Persona chavon = new Persona();
            Dni dni=new Dni();
            String rta;
         
            do{
        System.out.println("ingrese el dni");
        dni.setNumero(leer.nextInt());
        System.out.println("ingrese la serie del dni");
        dni.setSerie(leer.next());
        chavon.setDni(dni);
        
        System.out.println("ingrese su nombre");
        chavon.setNombre(leer.next());
        System.out.println("ingrese el apellido");
        chavon.setApellido(leer.next());
        
           System.out.println("desea ingresar otra persona, si ó no");
           rta=leer.next();
             listaDePersonas.add(new Persona());
            } while ("si".equalsIgnoreCase(rta));
        
  
        return new Persona();
        
    }
    public void mostrarArray(){
        for (Persona mostrar : listaDePersonas) {
            System.out.println(mostrar.toString());
        }
    }
}
