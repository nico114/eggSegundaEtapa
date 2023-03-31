/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosClase3;

import java.util.Scanner;

/**
 *
 * @author thell
 */
public class chat7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
    int correctas = 0;
    int incorrectas = 0;
    String cadena ;
    while (true) {
      System.out.print("Ingrese una cadena: ");
      cadena = sc.nextLine();
      if (cadena.equals("&&&&&")) {
        break;
      }
      if (cadena.length() == 5 && cadena.charAt(0) == 'X' && cadena.charAt(4) == 'O') {
        correctas++;
      } else {
        incorrectas++;
      }
    }
    System.out.println("Lecturas correctas: " + correctas);
    System.out.println("Lecturas incorrectas: " + incorrectas);
  }
} 
    
    

