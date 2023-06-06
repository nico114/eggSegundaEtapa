/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import entidad.Perros;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author thell
 */
public class Razas {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Perros crearPerro() {
        ArrayList<Perros> mascotas = new ArrayList();
        Perros dog = new Perros();
        String rta1;
        do {      
            System.out.println("ingrese una raza de perro");
            dog.setRaza(leer.nextLine());
            
            System.out.println("decea seguir ingresando? s ó n");
            rta1=leer.next();
            mascotas.add(dog);
        } while (rta1.equalsIgnoreCase("no"));
return new ;
    }
    public  void mostrar(Mascotas){
        System.out.println("la lista es:");
        for (Object object : col) {
            
        }
        
        
        
    }
}

