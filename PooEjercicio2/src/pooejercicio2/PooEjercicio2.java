/*
 * Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. A continuación, se deben crear los siguientes métodos:
Método constructor que inicialice el radio pasado como parámetro.
Métodos get y set para el atributo radio de la clase Circunferencia.
Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).

 */
package pooejercicio2;

/**
 *
 * @author thell
 */
public class PooEjercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       AtributoCircunferncia circunferencia = new AtributoCircunferncia(0);
       circunferencia.perimetro();
       circunferencia.area();
        System.out.println("el radio es" + circunferencia.getRadio());
        System.out.println("el area es: "+ circunferencia.getArea());
        System.out.println("el perimetro es: " + circunferencia.getPerimetro());
    }
    
}
