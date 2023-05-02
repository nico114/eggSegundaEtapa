/*
 * Crear una clase ParDeNumerosService, en el paquete Servicios, que deberá además implementar los siguientes métodos:
Método mostrarValores que muestra cuáles son los dos números guardados.
Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado al menor número. Previamente se deben redondear ambos valores.
Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package parDeNumerosServicio;

import java.util.Scanner;
import parDeNumerosEntidad.parDeNumEntidad;

/**
 *
 * @author thell
 */
public class ServicioParDeNumeros {

    Scanner leer = new Scanner(System.in);
    parDeNumEntidad numeros = new parDeNumEntidad();

    public void mostrarValores() {
        System.out.println("el primer numer es : " + numeros.getNum1());
        System.out.println("el primer numer es : " + numeros.getNum2());

    }

    public double devolverMayor() {
        double resmax;

        resmax = Math.max(numeros.getNum1(), numeros.getNum2());

        return resmax;
    }
//    Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado al menor número. Previamente se deben redondear ambos valores.

    public double calcularPotencia() {

        double potencia;
        double minimo;
        minimo = Math.min(numeros.getNum1(), numeros.getNum2());
        potencia = Math.pow(devolverMayor(), minimo);

        return potencia;

    }

}
