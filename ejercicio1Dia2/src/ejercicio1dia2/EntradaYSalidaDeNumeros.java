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
public class EntradaYSalidaDeNumeros {
    public static void main(String[] args) {
        
//        Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos.
//El programa deberá después mostrar el resultado de la suma


        Scanner leer = new Scanner(System.in);
        System.out.println("escriba 2 numeros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        System.out.println("la suma de los dos numeros es: " + (num1 + num2) );



       


        
    }
    
}
