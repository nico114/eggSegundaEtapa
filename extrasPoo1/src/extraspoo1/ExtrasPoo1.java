/*
 *esarrollar una clase Cancion con los siguientes atributos: título y autor.
Se deberá definir además dos constructores: uno vacío que inicializa el título y el autor a cadenas vacías
y otro que reciba como parámetros el título y el autor de la canción. Se deberán además definir los métodos getters y setters correspondientes.

 */
package extraspoo1;

/**
 *
 * @author thell
 */
public class ExtrasPoo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       atributosCancion cancion = new atributosCancion();
       cancion.CargarDatos();
        System.out.println(" la cancion es " + cancion.getTitulo()+ " el autor "+ cancion.getAutor());
    }
    
}
