/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ArreglosMain;

import ServicioArreglos.ServicioArreglos;

/**
 *
 * @author thell
 */
public class arreglosMain {

  
    public static void main(String[] args) {
         
   double arregloA [] = new double [50];
   double arregloB []= new double [20];
     ServicioArreglos arreglo = new ServicioArreglos();
     arreglo.iniciarArregloA(arregloA); 
      System.out.println("arreglo A cargado");
        System.out.println("----------------------------------------------------------------");
     arreglo.mostrarA(arregloA);
        System.out.println("**************************************");
     arreglo.ordenar(arregloA);
        System.out.println("arreglo A ordenado");
       System.out.println("----------------------------------------------------------------");
   arreglo.llenarB(arregloA, arregloB);
        System.out.println("arreglo B cargado");
    }
    
}
