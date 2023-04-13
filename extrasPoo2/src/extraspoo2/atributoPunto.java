/*
 * Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos,
sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto.
Generar un objeto puntos usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en los atributos del objeto.
Después, a través de otro método calcular y devolver la distancia que existe entre los dos puntos que existen en la clase Puntos.
Para conocer como calcular la distancia entre dos puntos consulte el siguiente link:
 */
package extraspoo2;

import java.util.Scanner;

/**
 *
 * @author thell
 */
public class atributoPunto {
    public int x1;
  //  public int x2;
    public int y1;
    //public int y2;
    //public int punto1;
    //public int punto2;
    public atributoPunto() {
    }

    public atributoPunto(int x1, int y1) {
        this.x1 = x1;
        this.y1 = y1;
    }
    
    public void cargarPunto(){
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese x");
        this.x1=leer.nextInt();
        System.out.println("ingrese y");
        this.y1=leer.nextInt();
    }
}
