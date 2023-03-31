
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author thell
 */
public class Reparado {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese dos numeros enteros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        String opcion;
        String acept = "";
        do {

            

            do {
                
                System.out.println("---------- MENU ----------");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Ingrese una Opción:");
            opcion = leer.nextLine();
                switch (opcion) {
                    case "1" -> System.out.println("la suma de los numeros es " + (num1 + num2));
                    case "2" -> System.out.println("la resta " + (num1 - num2));
                    case "3" -> System.out.println("el resultado de la multiplicacion es " + (num1 * num2));
                    case "4" -> System.out.println("el resultado de la division es " + (num1 / num2));
                    case "5" -> {
                        System.out.println("esta seguro s/n?");
                        acept = leer.nextLine();
                        if (opcion.equals("s")) {
                            acept = opcion;
                        }
                    }
                }

            } while (!opcion.equals("5"));

        } while (!acept.equalsIgnoreCase("s"));

    }


    
}
