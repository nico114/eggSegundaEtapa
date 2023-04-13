/*
 *Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos,
sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto.
Generar un objeto puntos usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en los atributos del objeto.
Después, a través de otro método calcular y devolver la distancia que existe entre los dos puntos que existen en la clase Puntos.
Para conocer como calcular la distancia entre dos puntos consulte el siguiente link:

 */
package extraspoo2;

/**
 *
 * @author thell
 */
public class ExtrasPoo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     atributoPunto punto = new atributoPunto();
     punto.cargarPunto();
     atributoPunto punto2 = new atributoPunto();
     punto2.cargarPunto();
     double ladoA = punto2.x1-punto.x1;
     double ladoB= punto2.y1-punto.y1;
        System.out.println(ladoA + " " + ladoB);
       double dist = Math.sqrt(Math.pow( ladoB, 2) + Math.pow(ladoA, 2));
        System.out.println("la distancia es " + dist);
    }
    
}
