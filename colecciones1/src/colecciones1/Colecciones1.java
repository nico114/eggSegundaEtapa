/*
 * Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
 */
package colecciones1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author thell
 */
public class Colecciones1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String rta;
        ArrayList<String> razas = new ArrayList();
        do {
            System.out.println("ingrese la raza de un perro");
            razas.add(leer.next());
            System.out.println("decea agregar otra raza , si ó no");
            rta = leer.next();

        } while (!rta.equalsIgnoreCase("no"));

        for (String ropes : razas) {
            System.out.println(ropes);

        }

//      
        Iterator<String> iterante = razas.iterator();
        System.out.println("que raza queres eliminar ");
        String rta2 = leer.next();
        boolean encontrada = false;
        while (iterante.hasNext()) {
            String aux = iterante.next();
            if (rta2.equalsIgnoreCase(aux)) {
                iterante.remove();
                encontrada = true;
                break;

            }
//            if (!rta2.equalsIgnoreCase(aux) && iterante.hasNext()==false) {
//                System.out.println("su raza no se encuentra");
//            }

        }
        if (encontrada) {

        } else {
            System.out.println("su raza no se encuentra");
        }
        Collections.sort(razas);
        System.out.println(razas);
       

    }

}
