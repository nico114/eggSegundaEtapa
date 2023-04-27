/*
 **Vamos a realizar una clase llamada Raices, donde representaremos los valores de una ecuación de 2º grado. Tendremos los 3 coeficientes como atributos,
llamémosles a, b y c. Hay que insertar estos 3 valores para construir el objeto a través de un método constructor. 
Luego, en RaicesServicio las operaciones que se podrán realizar son las siguientes:
Método getDiscriminante(): devuelve el valor del discriminante (double). El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra, el discriminante debe ser mayor o igual que 0.
Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para que esto ocurra, el discriminante debe ser igual que 0.
Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 posibles soluciones.
Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. Es en el caso en que se tenga una única solución posible.
Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(),
y mostrará por pantalla las posibles soluciones que tiene nuestra ecuación con los métodos obtenerRaices() o obtenerRaiz(),
según lo que devuelvan nuestros métodos y en caso de no existir solución, se mostrará un mensaje.
Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía el signo delante de -b
 */
package servicioCalculadora;

import entidadCalculadora.entidadCalculadora;
import extrapoo1calculadora.calculadoraMain;
import java.util.Scanner;

/**
 *
 * @author thell
 */
public class servicioCalculadora {

    Scanner leer = new Scanner(System.in);

    public entidadCalculadora llenerCoeficiente() {
        entidadCalculadora calculadora = new entidadCalculadora();
        System.out.println("ingrese a");
        calculadora.setA(leer.nextDouble());
        System.out.println("ingrese b");
        calculadora.setB(leer.nextDouble());
        System.out.println("ingrese c");
        calculadora.setC(leer.nextDouble());

        return calculadora;
    }
//        (b^2)-4*a*c

    public double getDiscriminante(entidadCalculadora calculadora) {
        double resultado1;
        resultado1 = Math.pow(calculadora.getB(), 2) - 4 * calculadora.getA() * calculadora.getC();
        return resultado1;

    }

    public boolean tieneRaices(entidadCalculadora calculadora) {

        return getDiscriminante(calculadora) >= 0;
    }

//  Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para que esto ocurra, el discriminante debe ser igual que 0.     
    public boolean tieneRaiz(entidadCalculadora calculadora) {

        return getDiscriminante(calculadora) == 0;
    }

    //   Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 posibles soluciones.
    // Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía el signo delante de -b
    public double obtenerRaices(servicioCalculadora calculadora) {

        double solucion1;
        double solucion2;
      
        solucion1 = ((-calculadora.getB() + Math.sqrt(Math.pow(calculadora.getB(), 2) - (4 * calculadora.getA() * calculadora.getC()))) / (2 * calculadora.getA()));

        solucion2 = ((calculadora.getB() + Math.sqrt(Math.pow(calculadora.getB(), 2) - (4 * calculadora.getA() * calculadora.getC()))) / (2 * calculadora.getA()));
        if ( servicioCalculadora.tieneRaices()  == true) {
          

        } else {
            System.out.println("no se puede resolver");
        }

        return 0 ;
    }
//Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. Es en el caso en que se tenga una única solución posible.

    public double obtenerRaiz(entidadCalculadora calculadora) {
        double resultado2;
        if (tieneRaiz() ) {
            resultado2 = -calculadora.getB() / (2 * calculadora.getA());

        }
        return resultado2;
//    Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(),
//y mostrará por pantalla las posibles soluciones que tiene nuestra ecuación con los métodos obtenerRaices() o obtenerRaiz(),
////según lo que devuelvan nuestros métodos y en caso de no existir solución, se mostrará un mensaje.
//    
    }

    public void calcular(calculadoraMain calculadora) {

        if (tieneRaiz() == true || tieneRaices() == true) {
            System.out.println("su resultado es: " + obtenerRaiz().resultado2);
            System.out.println("su resultado es: " + obtenerRaices().solucion1);
            System.out.println("su resultado es: " + obtenerRaices().solucion2);

        }

    }

}
