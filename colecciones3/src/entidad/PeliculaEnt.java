/*
 *Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
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
package entidad;

import java.time.Duration;
import java.util.Objects;

/**
 *
 * @author thell
 */
public class PeliculaEnt {
    
    private String nombre;
    private String director;
    private Duration duracion;

    public PeliculaEnt() {
    }

    public PeliculaEnt(String nombre, String director, Duration duracion) {
        this.nombre = nombre;
        this.director = director;
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Duration getDuracion() {
        return duracion;
    }

    public void setDuracion(Duration duracion) {
        this.duracion = duracion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.nombre);
        hash = 31 * hash + Objects.hashCode(this.director);
        hash = 31 * hash + Objects.hashCode(this.duracion);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PeliculaEnt other = (PeliculaEnt) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.director, other.director)) {
            return false;
        }
        return Objects.equals(this.duracion, other.duracion);
    }
public static comparator<PeliculaEnt>compararTiempo=new comparator<PeliculaEnt>(){
 @Override
   public int compararDuracion(PeliculaEnt p1, PeliculaEnt p2){
       return p2.getDuracion().compareTo(p1.getDuracion());
   };

public static comparator<PeliculaEnt>compararNombre=new comparator<PeliculaEnt>(){
 @Override
   public int compararNombre(PeliculaEnt n1, PeliculaEnt n2){
       return n2.getNombre().compareTo(n1.getNombre());
   };

        }
   

    @Override
    public String toString() {
        return "PeliculaEnt{" + "nombre=" + nombre + ", director=" + director + ", duracion=" + duracion + '}';
    }

    public String[] split(String a_) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
        