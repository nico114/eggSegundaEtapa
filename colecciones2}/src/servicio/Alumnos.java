/*
 * Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
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
package servicio;

import entidad.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author thell
 */
public class Alumnos {

    Scanner leer = new Scanner(System.in);

    public Alumno cargarAlumno() {

        ArrayList<Integer> al = new ArrayList();

        System.out.println("ingrese el nombre del alumno");
        String nombre = leer.next();

        for (int i = 0; i < 3; i++) {
            System.out.println("ingrese la nota " + (i + 1));
            al.add(leer.nextInt());
        }
        System.out.println(al.toString());

        return new Alumno(nombre, al);
    }
    
    public double notaFinal(Alumno a){
        int cont=0;
        for (Integer aux2 : a.getNotas()) {
            cont+=aux2;
            
            
        }
        return cont/3;
    }
    
    

}
