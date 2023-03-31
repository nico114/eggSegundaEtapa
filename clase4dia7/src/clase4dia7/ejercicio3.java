/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase4dia7;

import java.util.Scanner;

/**
 *
 * @author thell
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Por favor ingrese la cantidad de euros a convertir");
        double euros = leer.nextDouble();
        System.out.println("Por favor ahora ingrese el tipo de divisa a cambiar (dolares/yenes/Libras)");
        String divisa =leer.next();
        
        cambio(euros,divisa);
    }
    
    public static void cambio(double euros,String divisa){
       
        divisa=divisa.toLowerCase();
        
        switch (divisa){
            case "dolares":
                System.out.println("El cambio de "+euros+" euros a dolares es de: "+(euros*1.28611));
                break;
            case "libras":
                System.out.println("El cambio de "+euros+" euros a libras es de: "+(euros*0.86));
                break;
            case "yenes":
                System.out.println("El cambio de "+euros+" euros a yenes es de: "+(euros*129.852));
                break;
            default:
                System.out.println("El  tipo  de cambio ingresado no esta en la lista.");
                
        }
    }
}