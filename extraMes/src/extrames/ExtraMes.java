/*
 **Crea una clase en Java donde declares una variable de tipo array de Strings que contenga los doce meses del año, en minúsculas. 
A continuación, declara una variable mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo, mesSecreto = mes[9].
El programa debe pedir al usuario que adivine el mes secreto. Si el usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar el mes secreto.
Un ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!
 */
package extrames;

import java.util.Scanner;

/**
 *
 * @author thell
 */
public class ExtraMes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[] cargarMes = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        String mesSecreto = cargarMes[6];
        String mesUsuario;

        do {
            System.out.println("elija un mes y verifica si es correcto");
            mesUsuario = leer.next();
            if (mesUsuario.equalsIgnoreCase(mesSecreto)) {
                System.out.println("felicitaciones " + mesSecreto + " es correcto");
                break;
            } else {
                System.out.println("nop, proba otra vez");

            }
        } while (true);

    }

}
