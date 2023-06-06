/*
 *Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
package colecciones2;

import entidad.Alumno;
import java.util.ArrayList;
import java.util.Scanner;
import servicio.Alumnos;

/**
 *
 * @author thell
 */
public class Colecciones2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Alumnos alum = new Alumnos();
        ArrayList<Alumno> estudiante = new ArrayList();

        int v = 0;

        do {

            v++;
            System.out.println("Alumno " + v);
            estudiante.add(alum.cargarAlumno());
            System.out.println("¿Queres inscribir otro alumno?(s/n)");

        } while (!"n".equalsIgnoreCase(leer.next()));
        System.out.println(estudiante.toString());
        System.out.println("de quien queres ver la nota");
        String rta2=leer.next();
        boolean bandera=false;
        for (Alumno aux1 : estudiante) {
            if (rta2.equalsIgnoreCase(aux1.getNombre())) {
               bandera=true;
               System.out.println("La nota final de " + rta2 + " es " + alum.notaFinal(aux1));
            }
     
        }
        if (bandera==false) {
            System.out.println("no existesssssss");
            
        }
    }
    

}
