/*
 Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:

22

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package servicio;

import entidad.PeliculaEnt;
import static java.time.Duration.ofHours;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author thell
 */
public class peliculaServ {

    int horas;
    int min;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<PeliculaEnt> ArrayPelicula = new ArrayList();

    public PeliculaEnt cargarPelicula() {
        PeliculaEnt pelicula = new PeliculaEnt();

        String rta1;
        do {
            System.out.println("desea ingresar una pelicula; s ó n");
            rta1 = leer.nextLine();

            System.out.println("ingrese el nombre de la pelicula");
            pelicula.setNombre(leer.nextLine());
            System.out.println("ingrese el director de la pelicula");
            pelicula.setDirector(leer.nextLine());
            System.out.println("ingrese la duracion de la pelicula en hs");
            horas = leer.nextInt();
            System.out.println("ingrese la duracion de la pelicula en min");
            min = leer.nextInt();
            pelicula.setDuracion(ofHours(horas).plusMinutes(min));
            ArrayPelicula.add(pelicula);
        } while (rta1.equalsIgnoreCase("n"));
        System.out.println(ArrayPelicula);

        return new PeliculaEnt();
    }

    public void mostrarPelicula() {
        for (PeliculaEnt aux : ArrayPelicula) {
            System.out.println(aux.toString());

        }
    }

    public void pelisDe1Hs(PeliculaEnt pelicula) {
        for (PeliculaEnt aux : ArrayPelicula) {
            if (aux.equals(horas)) {
                System.out.println(aux);
            }

        }

    }

    public void ordenarPeliculas(PeliculaEnt pelicula) {
 ArrayList<PeliculaEnt>ordenado=new ArrayList<>();
 ordenado.sort((Comparator<? super PeliculaEnt>) PeliculaEnt.compararTiempo);
        System.out.println(ordenado.toString());
 }
}
