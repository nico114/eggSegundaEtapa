/*
Escriba un programa que valide si una nota está entre 0 y 10,
sino está entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.

 */
package ejerciciosdeguia3;

import java.util.Scanner;

public class EjercicioConWhile {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("ingrese las notas de sus alumnos");
        int notas = leer.nextInt();

        do {            
              
            System.out.println("las notas son " + notas);
        } while (notas > 0 || notas < 10);
       

        
            System.out.println("reingrese las notas");
        }

    }


