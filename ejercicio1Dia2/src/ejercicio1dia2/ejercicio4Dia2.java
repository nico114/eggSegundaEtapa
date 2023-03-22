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
public class ejercicio4Dia2 {

    public static void main(String[] args) {
//        Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble
//                , el triple y la raíz cuadrada de ese número. 
        Scanner leer = new Scanner(System.in);
        System.out.println("escriba un numero");
        int num = leer.nextInt();
        System.out.println("el doble del numero es:" + (num*2));
        System.out.println("el triple del numero es: " + (num*3));
        
        System.out.println("la raiz cuadrada  del numero es: " + Math.sqrt(num));
      

    }

}
