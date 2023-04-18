
 /*
 *Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un método "calcular_area" 
que calcule y devuelva el área del rectángulo. Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados de 4 y 6 y 
imprime el área del rectángulo.
 */
package extrapoo6;

/**
 *
 * @author thell
 */
public class ExtraPoo6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       AtributosRectangulo rectangulo = new AtributosRectangulo();
       ObjetoRectangulo1 rectangulo2 = new ObjetoRectangulo1();
       rectangulo.calcularArea();
       int resultadoDeObjeto;
       resultadoDeObjeto=rectangulo2.getLado4()*rectangulo2.getLado3();
        System.out.println("el resultado de objeto triangulo es: " + Math.pow(resultadoDeObjeto, 2) );
       
    }
    
}
