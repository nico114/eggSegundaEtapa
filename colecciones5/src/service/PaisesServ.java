/*
 *Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
 */
package service;

import entidad.PaisesEnt;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author thell
 */
public class PaisesServ {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashSet<PaisesEnt> paises = new HashSet();
   PaisesEnt pais;
    public HashSet  cargarPaises() {
     String country;
        String rta1;
        do {
            System.out.println("ingrese un pais");
            country=leer.next();
            System.out.println("desea continuar? s ó n");
            rta1 = leer.next();
           pais= new PaisesEnt(country);
            paises.add(pais);
        } while (rta1.equalsIgnoreCase("s"));

        return  paises;
    }
    public void mostrarPais(){
        for (PaisesEnt aux : paises) {
            System.out.println(aux);
            
        }
    }

    public void ordenarPaises(PaisesEnt pais){
        ArrayList<PaisesEnt> orden=new ArrayList(paises);
      orden.sort(PaisesEnt.comparaPais);
        System.out.println( orden );
        
        
    }
    public void borrarPais(PaisesEnt pais){
       Iterator<PaisesEnt> iterante;
        System.out.println("que pais queres eliminar ");
      String aux=leer.next();
        boolean encontrada = false;
        iterante=  paises.iterator();
        while (iterante.hasNext()) {
          
            if (iterante.next().equals(aux)) {
                iterante.remove();
                encontrada = true;
             

            }
        }
        if (encontrada) {

        } else {
            System.out.println("su pais no se encuentra");
        }
   

    }
        
    }

