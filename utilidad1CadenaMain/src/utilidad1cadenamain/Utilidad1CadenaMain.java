/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utilidad1cadenamain;

import servicioCadena.servicioCadena;

/**
 *
 * @author thell
 */
public class Utilidad1CadenaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        servicioCadena cadena = new servicioCadena();

        cadena.mostrarFrase();
        cadena.mostrarVocales();
        cadena.invertirFrase();
        cadena.vecesRepetido();
        cadena.compararLongitud();
        cadena.unirFrase();
        cadena.reemplazar();
        cadena.contiene();
    }

}
