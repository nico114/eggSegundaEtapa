/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooejercicio1;

import java.util.Scanner;

/**
 *
 * @author thell
 */
public class DatosDelUsuario {
    public String nombre;
    public String apellido;
    public String dni;

    public DatosDelUsuario(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public DatosDelUsuario() {
    }
    public void cargaDeDAtosDeUsuario(){
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el nombre");
        this.nombre=leer.next();
        System.out.println("ingrese el apellido");
        this.apellido=leer.next();
        System.out.println("ingrese el dni");
        this.dni=leer.next();
        
    }

    @Override
    public String toString() {
        return "DatosDelUsuario{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + '}';
    }
    
    
            
    
}
