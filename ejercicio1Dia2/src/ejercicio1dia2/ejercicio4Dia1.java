/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1dia2;

import java.util.Scanner;

/**
 *
 * @author thell
 */
public class ejercicio4Dia1 {
    public static void main(String[] args) {
        
        
        
        
//        
//        Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit.
//        La fórmula correspondiente es: F =.


        Scanner leer = new Scanner(System.in);
        System.out.println("escriba la temperatura");
        int c = leer.nextInt();
        double f =  32 + (9 * c / 5);
        System.out.println(" su temperatura en centigrados es: " + c + "y en fahrenheit es: " + f );
     
       
        
    }
    
}
