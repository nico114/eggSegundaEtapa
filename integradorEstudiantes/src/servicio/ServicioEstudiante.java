/*
 * Una escuela ha terminado su ciclo lectivo y todos sus alumnos ya rindieron el
examen final. La escuela nos ha pedido que calculemos el promedio de notas
final de todos sus alumnos y saber qué alumnos han recibido una nota por
encima de ese promedio.
Para esto vamos a tener que crear un objeto de tipo Estudiante, sus atributos
van a ser nombre y nota (representando la nota obtenida en el final).
La escuela consta con tan solo 8 estudiantes, por lo que deberemos crear los 8
estudiantes con sus respectivas notas.
Una vez creado los estudiantes deberemos guardar los estudiantes en un
arreglo de objetos tipo Estudiante, usando ese arreglo tenemos que realizar las
dos tareas que nos ha pedido la escuela.
1. Calcular y mostrar el promedio de notas de todo el curso
2. Retornar otro arreglo con los nombre de los alumnos que recibieron una
nota mayor al promedio del curso
3. Por último, deberemos mostrar todos los estudiantes con una nota
mayor al promedio.
Nota: para crear un vector de objetos la definición es la siguiente:
Objeto nombreVector[] = new Objeto[];
 */
package servicio;

import entidad.Estudiante;
import java.util.Scanner;

/**
 *
 * @author thell
 */
public class ServicioEstudiante {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Estudiante[] cargarEstudiante() {

        Estudiante[] estudiantes = new Estudiante[3];

        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println("Ingrese el nombre del estudiante " + (i + 1) + ": ");
            String nombre = leer.next();
            System.out.println("Ingrese la nota del estudiante " + (i + 1) + ": ");
            int nota = leer.nextInt();

            estudiantes[i] = new Estudiante(nombre, nota);
        }
        return estudiantes;
    }

    public double promedio(Estudiante[] estudiantes) {
        double suma = 0;
        double promedio;

        for (Estudiante estudiante : estudiantes) {
            suma += estudiante.getNota();
        }
        promedio= suma / estudiantes.length;

        System.out.println("el promedio de la clase es:" + promedio);
        return promedio;
    }

    public void mayorPromedio(Estudiante[] estudiantes) {
        String contEstudiantes="" ;
   
        for (Estudiante estudiante : estudiantes) {
            if (promedio(estudiantes)<estudiante.getNota()) {
                contEstudiantes=estudiante.getNombre();
                
            
        }
      
       
    }
      System.out.println("el estudiante con mayor promedio es" + contEstudiantes);
}
}