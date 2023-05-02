/*
 *Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase con otra nueva frase ingresada por el usuario.
Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una nueva frase ingresada por el usuario y mostrar la frase resultante.
Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.
Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario y devuelve verdadero si la contiene y falso si no.

 */
package servicioCadena;

import cadenaEntidad.entidadCadena;
import java.util.Scanner;

/**
 *
 * @author thell
 */
public class servicioCadena {

    entidadCadena frase1 = new entidadCadena();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void mostrarFrase() {
        System.out.println(frase1.getFrase());
    }

    public void mostrarVocales() {
        String frases = frase1.getFrase();
        int contlet = 0;
        for (int i = 0; i < frase1.getFrase().length(); i++) {
            char letra = frases.toLowerCase().charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contlet++;

            }

        }
        System.out.println("la cantidad de vocales es " + contlet);
    }
//Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".

    public void invertirFrase() {

        for (int i = frase1.getFrase().length() - 1; i >= 0; i--) {
            System.out.print(frase1.getFrase().charAt(i));
        }
        System.out.println(" ");

    }
//    Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
//Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.

    public void vecesRepetido() {
        char idLetra = 0;
        System.out.println("ingrese la letra a identificar");
        idLetra = leer.next().toLowerCase().charAt(idLetra);

        int contLetras = 0;

        for (int i = 0; i < frase1.getFrase().length(); i++) {
            if (frase1.getFrase().toLowerCase().charAt(i) == idLetra) {
                contLetras++;

            }

        }
        System.out.println("su letra es: " + idLetra + " y se repite " + contLetras + " veces");
    }
//    Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase
//    con otra nueva frase ingresada por el usuario.

    public String compararLongitud() {
        String fraseUsuario;

        System.out.println("ingrese una frase");
        fraseUsuario = leer.next();

        if (fraseUsuario.length() == frase1.getFrase().length()) {
            System.out.println("la frase ingresada es igual a la frase original, tiene " + frase1.getFrase().length() + " caracteres");
        } else {
            System.out.println("la frase es diferente " + fraseUsuario + " tiene " + fraseUsuario.length() + " caracteres y la origina " + frase1.getFrase().length());
        }

        return fraseUsuario;
    }
//      método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una nueva frase ingresada por el usuario
//    y mostrar la frase resultante.

    public void unirFrase() {
        String fraseNueva;
        System.out.println("ingrese una frase");
        fraseNueva = leer.next();
        System.out.println(frase1.getFrase() + " " + fraseNueva);
    }
    //Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.

    public void reemplazar() {
        String caracter;
        String reemplazo;
        System.out.println("ingrese un caracter");
        caracter = leer.next().toLowerCase();

        reemplazo = frase1.getFrase().replace("a", caracter);

        System.out.println(reemplazo);

    }
//    Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario y devuelve verdadero si la contiene y falso si no.

    public boolean contiene() {
        String letra;
        System.out.println("ingrese una letra para ver si existe en la frase");
        letra = leer.next();

        return letra.equalsIgnoreCase(frase1.getFrase());
    }
}
