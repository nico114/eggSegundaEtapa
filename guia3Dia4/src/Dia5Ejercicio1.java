
import java.util.Scanner;

/*Crear un programa que dado un número determine si es par o impar.
*/
public class Dia5Ejercicio1 {
    public static void main(String[] args) {
        
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese un numero ");
        
        int num=leer. nextInt();
        
        
        if (num % 2==0) 
        {
            System.out.println(num + " es par");
            
        } else
        {
            System.out.println(num + " es impar");
        }
        
        
    }
    
}
