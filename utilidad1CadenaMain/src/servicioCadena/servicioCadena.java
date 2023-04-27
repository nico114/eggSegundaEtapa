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

    public void crearFrase() {
        System.out.println("ingrese la frase");
        frase1.setFrase(leer.nextLine());
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
    public void invertirFrase(){
        String invertida="";
        String frase2=frase1.getFrase();
        for (int i =frase2.length()-1) {
            
        }
        
    }
    public void mostrarFrase() {

        System.out.println(frase1.getFrase());

    }

}
