/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package personamain;

import java.util.Scanner;
import personamain.entidadPersona.EntidadPersona;
import servicioPersona.servicioPersona;

/**
 *
 * @author thell
 */
public class PersonaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        servicioPersona p = new servicioPersona();
        System.out.println("ingrese la cantidad de personas");
       int n= leer.nextInt();
      EntidadPersona[] pers = new EntidadPersona[n];
      int Imc = new int[n];
      
        
                
                


    }

}
