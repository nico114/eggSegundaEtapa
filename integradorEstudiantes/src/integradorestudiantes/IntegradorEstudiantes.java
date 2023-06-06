/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package integradorestudiantes;

import entidad.Estudiante;
import java.util.Scanner;
import servicio.ServicioEstudiante;

/**
 *
 * @author thell
 */
public class IntegradorEstudiantes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 ServicioEstudiante servicio=new ServicioEstudiante();
   Estudiante[] estudiantes = servicio.cargarEstudiante();
   servicio.promedio(estudiantes);
  servicio.mayorPromedio(estudiantes);
    }
}
