/*
 * Crear la clase ArregloService, en el paquete servicio, con los siguientes métodos:
Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
 */
package ServicioArreglos;

import java.util.Arrays;

/**
 *
 * @author thell
 */
public class ServicioArreglos {

    public void iniciarArregloA(double[] arregloA) {

        for (int i = 0; i < arregloA.length; i++) {
            arregloA[i] = (int) (Math.random() * 10);

        }
        System.out.println("*****************************");
    }

    public void mostrarA(double[] arregloA) {
        for (int i = 0; i < arregloA.length; i++) {
            System.out.println("[" + arregloA[i] + "]");
        }
        System.out.println("***********************************");
    }

    public void ordenar(double[] arregloA) {
        Arrays.sort(arregloA);
        mostrarA(arregloA);
    }
//Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.

    public void llenarB(double[] arregloA, double[] arregloB) {

    arregloB=Arrays.copyOf(arregloA, 10);
        Arrays.fill(arregloB, 10, arregloB.length, 0.5);
     
        for (int i = 0; i < arregloB.length; i++) {
            System.out.println("{ " + arregloB[i] + " }");
        }
        System.out.println("********************************************");

    }
}
