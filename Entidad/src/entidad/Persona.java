/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

import java.util.Date;

/*
 *
 * @author thell
 */

public class Persona {
    public String nombre;
    public String apellido;
    public Date edad;
    public String dni;
    public String sexo;
    public String nacionalidad;

    public Persona(String nombre, String apellido, Date edad, String dni, String sexo, String nacionalidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        this.nacionalidad = nacionalidad;
    }

    Persona() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
