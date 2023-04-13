/*
 * esarrollar una clase Cancion con los siguientes atributos: título y autor. Se deberá definir además dos constructores
: uno vacío que inicializa el título y el autor a cadenas vacías y otro que reciba como parámetros el título
y el autor de la canción. Se deberán además definir los métodos getters y setters correspondientes.

 */
package extraspoo1;

import java.util.Scanner;

/**
 *
 * @author thell
 */
public class atributosCancion {
    private String titulo;
    private String autor;

    public atributosCancion() {
    }

    public atributosCancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void CargarDatos(){
        Scanner leer = new Scanner(System.in).useDelimiter("/n");
        System.out.println("ingrese el nombre del autor");
        this.autor=leer.nextLine();
        System.out.println("ingrese el titulo de la cancion");
        this.titulo=leer.nextLine();
       
    }
    
}

