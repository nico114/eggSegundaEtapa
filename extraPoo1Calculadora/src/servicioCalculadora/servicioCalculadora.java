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
 entidadCalculadora calculadora = new entidadCalculadora();
    public entidadCalculadora llenerCoeficiente() {

        System.out.println("ingrese a");
        calculadora.setA(leer.nextInt());
        System.out.println("ingrese b");
        calculadora.setB(leer.nextInt());
        System.out.println("ingrese c");
        calculadora.setC(leer.nextInt());

        return calculadora;
    }
//   Método getDiscriminante(): devuelve el valor del discriminante (double). El discriminante tiene la siguiente fórmula: (b^2)-4*a*c    

    public int getDiscriminante(entidadCalculadora calculadora) {
        int resultado1;
        resultado1 = (int) (Math.pow(calculadora.getB(), 2) - 4 * calculadora.getA() * calculadora.getC());
        return resultado1;

    }
//Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra, el discriminante debe ser mayor o igual que 0.

    public boolean tieneRaices() {

        return getDiscriminante(calculadora) >= 0;
    }

//  Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para que esto ocurra, el discriminante debe ser igual que 0.     
    public boolean tieneRaiz() {

        return getDiscriminante(calculadora) == 0;
    }

    //   Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 posibles soluciones.
    // Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía el signo delante de -b
    public void obtenerRaices() {

        int result1;
      

        if (tieneRaices() == true){

            result1 = (int) ((-calculadora.getB() + Math.sqrt(Math.pow(calculadora.getB(), 2) - (4 * calculadora.getA() * calculadora.getC()))) / (2 * calculadora.getA()));

       

            System.out.println("resultado 1: " + result1);
           

        } else {
            System.out.println("no se puede resolver");
        }

    }
    public void obtenerRaices2(){
          int result2;
          
          
        if (tieneRaices() == true){

        
            result2 = (int) ((calculadora.getB() + Math.sqrt(Math.pow(calculadora.getB(), 2) - (4 * calculadora.getA() * calculadora.getC()))) / (2 * calculadora.getA()));

       
            System.out.println("resultado 2: " + result2);

        } else {
            System.out.println("no se puede resolver");
        }
          
          
          
          
          
    }
//Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. Es en el caso en que se tenga una única solución posible.

    public void obtenerRaiz() {
        int solucion1;
        int solucion2;

        if (tieneRaiz() == true) {

            solucion1 = (int) ((-calculadora.getB() + Math.sqrt(Math.pow(calculadora.getB(), 2) - (4 * calculadora.getA() * calculadora.getC()))) / (2 * calculadora.getA()));

            solucion2 = (int) ((calculadora.getB() + Math.sqrt(Math.pow(calculadora.getB(), 2) - (4 * calculadora.getA() * calculadora.getC()))) / (2 * calculadora.getA()));
            
            System.out.println("la solucion es: " +solucion1);
            System.out.println("la solucion es: " +solucion2);
        } else {
            System.out.println("no se puede resolver");
        }

    }

//    Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(),
//y mostrará por pantalla las posibles soluciones que tiene nuestra ecuación con los métodos obtenerRaices() o obtenerRaiz(),
////según lo que devuelvan nuestros métodos y en caso de no existir solución, se mostrará un mensaje.
//    
    public void calcular(){
        System.out.println(tieneRaices());
        System.out.println(tieneRaiz());
        System.out.println(obtenerRaices());
        System.out.println(tieneRaices2());
   
    }
   

}
