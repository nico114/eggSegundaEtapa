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
public class ejercicio4 {

public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Por favor ingrese un numero");
        int num = leer.nextInt();
        boolean primosos;
        
        primosos=primo(num);
        
        System.out.println("El numero ingresado es primo? "+primosos);
        

        
    }
    public static boolean primo(int num){
        boolean primos;
        
        
        for (int i=2;i<num; i++){
            if (num % i == 0){
               primos=false;
               return primos;
            }
        }
        
        primos=true;
        return primos;
        
       
        
        
    }

}