/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dia6guia3;

import java.util.Scanner;

/**
 *
 * @author thell
 */
public class Ejercicio6Nuevo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              Scanner scanner = new Scanner(System.in);
        int correct = 0;
        int incorrect = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("&&&&&")) {
                break;
            }
            if (input.length() == 5 && input.charAt(0) == 'X' && input.charAt(4) == 'O') {
                correct++;
            } else {
                incorrect++;
            }
        }
        System.out.println("Correct: " + correct);
        System.out.println("Incorrect: " + incorrect);
    }

    }
    

