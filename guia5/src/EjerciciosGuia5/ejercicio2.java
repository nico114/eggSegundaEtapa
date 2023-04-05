/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosGuia5;

import java.util.Scanner;

/**
 *
 * @author thell
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            System.out.println("Ingrese el tamaño del vector");
        Scanner leer = new Scanner(System.in);
        int n = leer.nextInt();
        int[] vector = new int[n];
        
        for (int i = 0; i < vector.length; i++) {
            
            vector[i] = (int) ( Math.random() *10);
            System.out.println(vector[i]);
            
        }
        
        System.out.println("Ingrese un número que desea buscar");
        int num = leer.nextInt();
        int contador = 0;
        int x = 0;
        for (int elemento: vector) {
            x++;
            if(elemento == num){
                contador++;
                System.out.println("El número se encuentra en la posición" + x);
            }
        }
        System.out.println("Las veces que se repite fueron :"+ contador);
    }
    
    }
    

