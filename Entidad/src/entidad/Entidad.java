/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entidad;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author thell
 */
public class Entidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//       public String nombre;
//    public String apellido;
//    public 
//    public String dni;
//    public String sexo;
//    public String nacionalidad;  
        Persona p1 = new Persona();
        System.out.println("ingrese nombre");
        Scanner leer = new Scanner(System.in);
        p1.nombre = leer.next();

        System.out.println("ingrese");

        System.out.println(p1.nombre + p1.dni + p1.nacionalidad + p1.sexo);
    }

}
